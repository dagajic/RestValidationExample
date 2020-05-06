package com.example.rest.validation.model;

public class DocRequest {

	private int reqId;
	private Document document;
	
	
	
	public DocRequest(int reqId, Document document) {
		super();
		this.reqId = reqId;
		this.document = document;
	}
	
	public int getReqId() {
		return reqId;
	}
	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	public Document getDocument() {
		return document;
	}
	public void setDocument(Document document) {
		this.document = document;
	}
	
}
