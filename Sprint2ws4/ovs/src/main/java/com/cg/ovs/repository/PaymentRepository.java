package com.cg.ovs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.ovs.domain.Payment;

/**It is for implementing all the crud operations.*/
@Repository
public interface PaymentRepository extends CrudRepository<Payment,Integer>
{
	Payment findByPaymentId(int paymentId);
}
