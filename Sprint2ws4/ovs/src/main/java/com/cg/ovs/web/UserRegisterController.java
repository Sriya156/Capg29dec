package com.cg.ovs.web;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.service.MapValidationErrorService;
import com.cg.ovs.service.UserLoginService;
import com.cg.ovs.service.UserRegisterService;

@RestController
@RequestMapping("ovs/api/")
public class UserRegisterController {
	@Autowired
	UserRegisterService userRegisterService;
	@Autowired
	UserLoginService userLoginService;
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@PostMapping("/register")
	public ResponseEntity<?> registerNewUser(@Valid @RequestBody UserDetail userDetail, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
			return errorMap;
		UserDetail testUser = userRegisterService.saveOrUpdate(userDetail);
		return new ResponseEntity<UserDetail>(testUser, HttpStatus.OK);

}
	
	
}