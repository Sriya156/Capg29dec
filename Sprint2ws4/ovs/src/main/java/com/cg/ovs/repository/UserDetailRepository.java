package com.cg.ovs.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.cg.ovs.domain.UserDetail;

public interface UserDetailRepository extends CrudRepository<UserDetail,Integer> {

	UserDetail findByEmailId(String emailId);
	@Query("from UserDetail  where role=?1")
	Iterable<UserDetail> findByRole(int role);

}