/**
 * 
 */
package io.saikatsinchansain.consumerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author Saikat Sain
 *
 */

@RestController
public class ConsumerController {

//	private String baseUrl = "http://temperature-service";
//	private static final String TEMPERATURE_GET_ROOT_ENDPOINT = "/temperature/get";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientBuilder;

	@GetMapping("/stats")
	public String getTemperature() {
		// Synchronous way of retrieving data
		return restTemplate.getForObject("http://temperature-service/temperature/get", String.class);

		// Async way of retrieving data
		/* return webClientBuilder.build()
				.get()
				.uri(baseUrl,TEMPERATURE_GET_ROOT_ENDPOINT)
				.retrieve()
				.bodyToMono(String.class)
				.block();
				*/
	}
}
