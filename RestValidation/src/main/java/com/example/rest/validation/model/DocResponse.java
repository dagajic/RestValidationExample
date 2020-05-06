package com.example.rest.validation.model;

public class DocResponse {

	private String status;
	private String errMsg;
	
	
	public DocResponse(String status, String errMsg) {
		super();
		this.status = status;
		this.errMsg = errMsg;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	
	
}
