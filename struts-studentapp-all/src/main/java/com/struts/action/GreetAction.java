package com.struts.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public  class GreetAction extends ActionSupport implements SessionAware {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Map<String, Object> userSession;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

     

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ValueStack stack= ActionContext.getContext().getValueStack();
		Map<String, Object> mapData= new HashMap<>();
		mapData.put("message","greaat day");
		mapData.put("fruits", Arrays.asList("apple","range"));
		
		stack.push(mapData);
		System.out.println(stack.size());
		return SUCCESS;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		userSession=session;
	}




}
