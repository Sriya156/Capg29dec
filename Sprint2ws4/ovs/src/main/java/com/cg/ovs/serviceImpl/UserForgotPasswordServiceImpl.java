package com.cg.ovs.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.exception.EmailNotFoundException;
import com.cg.ovs.repository.UserDetailRepository;
import com.cg.ovs.service.UserForgotPasswordService;
@Service
public class UserForgotPasswordServiceImpl implements UserForgotPasswordService {
	@Autowired
	UserDetailRepository userDetailRepository;

	@Override
	public UserDetail updatePassword(UserDetail userDetail) {
		try {
		UserDetail testUser=userDetailRepository.findByEmailId(userDetail.getEmailId());
		if(testUser.getLoginName().equals(userDetail.getLoginName()))
		{
			testUser.setPassword(userDetail.getPassword());
		}
		return  userDetailRepository.save(testUser);
		}catch(Exception e)
		{ 
			throw new EmailNotFoundException("Email Id doesn't Exists");
		}
		
		
		
		
	
	}

	

}