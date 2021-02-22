package com.cg.ovs.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.service.MapValidationErrorService;
import com.cg.ovs.service.UserForgotPasswordService;

@RestController
@RequestMapping("ovs/api/forgotPassword")
public class UserForgotPasswordController {
	@Autowired
	MapValidationErrorService mapValidationErrorService;
	@Autowired
	UserForgotPasswordService userForgotPasswordService;
	@PutMapping("")
	public ResponseEntity<?> forgotPassword(@Valid @RequestBody UserDetail userDetail, BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if (errorMap != null)
		{
			System.out.println(errorMap);
			return errorMap;
		}
		UserDetail testUser = userForgotPasswordService.updatePassword(userDetail);
		return new ResponseEntity<UserDetail>(testUser, HttpStatus.OK);

}
}