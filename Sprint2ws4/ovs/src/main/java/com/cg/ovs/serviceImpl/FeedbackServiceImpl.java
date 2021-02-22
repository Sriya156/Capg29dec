package com.cg.ovs.serviceImpl;
import com.cg.ovs.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.ovs.domain.Feedback;
import com.cg.ovs.repository.FeedbackRepository;

@Service

public class FeedbackServiceImpl implements FeedbackService
{
	@Autowired
	private FeedbackRepository feedbackRepository;
	
	public Feedback saveOrUpdate(Feedback feedback)
	{
		return feedbackRepository.save(feedback);
	
	}
	
	public Iterable<Feedback> viewallfeedbacks(){
		return feedbackRepository.findAll();
	}

}
