/**
 * 
 */
package com.kd.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author klawand
 *
 */

@RestController
public class TestController {

	
	@Value("${message.key}")
	private String messageKey;
	

	@GetMapping(value = "/prop/read")
	public ResponseEntity<String> readVal(){
		return new ResponseEntity<String>(messageKey,HttpStatus.OK);
	}
	
}
