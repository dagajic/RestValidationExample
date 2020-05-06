package com.example.rest.validation.model;

public class Document {
	
	private int id;
	private String sender;
	private String receiver;
	
	
	public Document(int id, String sender, String receiver) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	
	

}
