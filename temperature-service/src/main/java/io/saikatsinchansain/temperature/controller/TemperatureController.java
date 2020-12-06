/**
 * 
 */
package io.saikatsinchansain.temperature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.saikatsinchansain.temperature.model.Temperature;

/**
 * @author Saikat Sain
 *
 */
@RestController
public class TemperatureController {
	
	@Autowired
	ObjectMapper objectMapper;
	
	@GetMapping("/temperature/get")
	public String getTemperature() throws JsonProcessingException {
		Temperature temp = new Temperature();
		temp.setCelsuis(true);
		temp.setValue(32.0f);
		return objectMapper.writeValueAsString(temp);	
	}
	

}
