package com.cg.ovs.serviceImpl;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.domain.Address;
import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.exception.EmailNotFoundException;
import com.cg.ovs.repository.UserDetailRepository;
import com.cg.ovs.service.UserLoginService;
@Service
public class UserLoginServiceImpl implements UserLoginService {
 @Autowired
 UserDetailRepository userDetailRepository;
	@Override
	public UserDetail loginUser(String emailId,String password) {
		UserDetail loginUser=userDetailRepository.findByEmailId(emailId);
		if(loginUser==null)
		{
			return null;
		}
		else if(!password.equals(loginUser.getPassword()))
		{
			return null;
	
		}
		return loginUser;
	}
	@Override
	public UserDetail viewByEmail(@Valid String emailId) {
		try {
			return userDetailRepository.findByEmailId(emailId);
			} catch (Exception e) {
			throw new EmailNotFoundException("Email doesn't Exists");
		}
	}
	@Override
	public UserDetail updateProfile(@Valid UserDetail userDetail) {
		try {
			UserDetail testUser=userDetailRepository.findByEmailId(userDetail.getEmailId());
			testUser.setPassword(userDetail.getPassword());
			testUser.setLoginName(userDetail.getLoginName());
			testUser.setContact(userDetail.getContact());
			return  userDetailRepository.save(testUser);
			}catch(Exception e)
			{ 
				throw new EmailNotFoundException("Email Id doesn't Exists");
			}
	}
	@Override
	public String deleteProfile(@Valid String emailId) {
		try {
			UserDetail testUser=userDetailRepository.findByEmailId(emailId);
			userDetailRepository.delete(testUser);
			return "Sucessfully deleted "+emailId;
			}catch(Exception e)
			{ 
				throw new EmailNotFoundException("Email Id doesn't Exists");
			}
		
	}
	@Override
	public UserDetail updateAddress(@Valid Address address,String emailId) {
		try
		{
			UserDetail testUser=userDetailRepository.findByEmailId(emailId);
			testUser.setAddress(address);
			return userDetailRepository.save(testUser);
		}catch(Exception e)
		{
			throw new EmailNotFoundException("Email Id doesn't Exists");
		}
	
	}
	

}