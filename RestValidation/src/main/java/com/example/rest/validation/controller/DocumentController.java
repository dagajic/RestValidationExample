package com.example.rest.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.validation.model.DocRequest;
import com.example.rest.validation.model.DocResponse;
import com.example.rest.validation.validator.Validator;

@RestController
public class DocumentController {

	@Autowired
	private Validator validator;
		
	@PostMapping("/send")
    @ResponseBody
	public ResponseEntity<DocResponse> sendDocument(@RequestBody DocRequest request) {
		
		DocResponse response = validator.validate(request);
		
		return new ResponseEntity<DocResponse>(response, HttpStatus.OK);
	}
}
