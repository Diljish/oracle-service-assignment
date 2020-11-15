package com.oracle.diljish.assignment.model;

public class Response {
	
	 private String message;
	 private Integer status;
	 private Object result;
	 
	 public Response(){}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}
	 
	public Response(Object result, Integer status, String message){
        this.result=result;
        this.status=status;
        this.message = message;
    }

}
