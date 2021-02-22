package com.cg.ovs.repository;


import org.springframework.data.repository.CrudRepository;

import com.cg.ovs.domain.Address;

public interface AddressRepository extends CrudRepository<Address,Integer> {


}