package com.cg.ovs.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cg.ovs.domain.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Integer>
{

	
}
