package com.cg.ovs.service;
import com.cg.ovs.domain.UserDetail;

public interface UserAdminService {
	public Iterable<UserDetail> viewAll();
	public UserDetail viewByEmail(String emailId);
	public Iterable<UserDetail> viewByRole(int role);

}