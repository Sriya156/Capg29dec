package com.cg.ovs.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.service.UserAdminService;
@RestController
@RequestMapping("ovs/api/Admin")
public class AdminController {
	@Autowired
	UserAdminService userAdminService;
	@GetMapping("/findAll")
	public ResponseEntity<?> viewAllUsers() {
		Iterable<UserDetail> userDetails =userAdminService.viewAll();
		return new ResponseEntity<Iterable>(userDetails,HttpStatus.OK);
	}
	@GetMapping("/findByRole/{role}")
	public ResponseEntity<?> viewAllByRole(@PathVariable int role)
	{
		if(role==1 || role==2)
		{
			Iterable<UserDetail> userDetails =userAdminService.viewByRole(role);
			System.out.println(userDetails);
			return new ResponseEntity<Iterable>(userDetails,HttpStatus.OK);
			
		}
		else 
		{
			return new ResponseEntity<String>("Enter role either 1(Admin) or 2(Customer)",HttpStatus.OK);
	}
}
}