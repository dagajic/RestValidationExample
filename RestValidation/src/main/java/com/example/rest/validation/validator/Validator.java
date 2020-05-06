package com.example.rest.validation.validator;

import org.springframework.stereotype.Component;

import com.example.rest.validation.exception.NullOrEmptyValueException;
import com.example.rest.validation.model.DocRequest;
import com.example.rest.validation.model.DocResponse;

@Component
public class Validator {

	public DocResponse validate(DocRequest request) {
		if(request.getReqId() == 0)
			throw new NullOrEmptyValueException("nije postavljen ReqId");
		return new DocResponse("ACCEPTED", null);
	}
}
