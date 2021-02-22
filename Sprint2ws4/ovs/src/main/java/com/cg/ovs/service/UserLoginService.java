package com.cg.ovs.service;

import javax.validation.Valid;

import com.cg.ovs.domain.Address;
import com.cg.ovs.domain.UserDetail;

public interface UserLoginService {

	public UserDetail loginUser(String emailId, String password);

	public UserDetail viewByEmail(@Valid String emailId);

	public UserDetail updateProfile(@Valid UserDetail userDetail);

	public String deleteProfile(@Valid String emailId);
	
	public UserDetail updateAddress(@Valid Address address,String emailId);

}