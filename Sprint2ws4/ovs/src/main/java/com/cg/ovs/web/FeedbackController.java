package com.cg.ovs.web;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ovs.domain.Feedback;
import com.cg.ovs.repository.FeedbackRepository;
import com.cg.ovs.service.FeedbackService;
import com.cg.ovs.service.MapValidationErrorService;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {
	
	
	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private FeedbackRepository repo;
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	@PostMapping("/save")
	public ResponseEntity<?> createNewFeedback(@Valid @RequestBody Feedback feedback,BindingResult result) {
		ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		if(!repo.existsById(feedback.getFeedbackId())) {
		Feedback fb = feedbackService.saveOrUpdate(feedback);
		return new ResponseEntity<Feedback>(fb, HttpStatus.OK);}
		else {
			return new ResponseEntity<String>("Repeated or Existing ID", HttpStatus.OK);
		}
	}
	
	@GetMapping("/viewallfeedback")
	public Iterable<Feedback> viewAllFeedbacks(){
		
	 return feedbackService.viewallfeedbacks();
	}

	@DeleteMapping("/deletebyid/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		if(repo.existsById(id)) {
		repo.deleteById(id);
		 return new  ResponseEntity<String>(HttpStatus.OK);
		}
		else {
		 return new  ResponseEntity<String>("NO ID FOUND",HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping("/viewById/{id}")
	public Optional<Feedback> viewById(@PathVariable int id) {
		return repo.findById(id);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateFeedback(@RequestBody Feedback feedback){
		if(repo.existsById(feedback.getFeedbackId())) {
				feedback.setFeedbackId(feedback.getFeedbackId());
			repo.save(feedback);
			return new ResponseEntity<String>("UPDATED SUCCESSFULLY",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("NO EXISTING id FOUND IN OUR DATABASE",HttpStatus.BAD_REQUEST);
			}
}
}
