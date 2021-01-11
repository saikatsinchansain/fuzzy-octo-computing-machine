/**
 * 
 */
package io.enrollment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Saikat Sain
 *
 */
@RestController
public class EnrollmentController {
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("/client")
	public ResponseEntity<String> getClient(){
		return new ResponseEntity<String> ("Spring Java",HttpStatus.OK);	
	}
	

}
