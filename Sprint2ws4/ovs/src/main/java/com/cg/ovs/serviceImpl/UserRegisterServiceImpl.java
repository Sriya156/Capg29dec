package com.cg.ovs.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ovs.domain.UserDetail;
import com.cg.ovs.exception.UserEmailException;
import com.cg.ovs.repository.UserDetailRepository;
import com.cg.ovs.service.UserRegisterService;
@Service
public class UserRegisterServiceImpl implements UserRegisterService{
	@Autowired
	UserDetailRepository userDetailRepository;

	@Override
	public UserDetail saveOrUpdate(UserDetail userdetail) {
		try {
		return userDetailRepository.save(userdetail);
		}catch(Exception e)
		{
			throw new UserEmailException("Email Id "+userdetail.getEmailId()+" Already Exists");
		}
		
		
	}

}