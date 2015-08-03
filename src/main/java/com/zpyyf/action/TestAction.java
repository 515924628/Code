package com.zpyyf.action;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	public String add(){
		System.out.println("add");
		return "add";
	}

	public String list(){
		System.out.println("list");
		return "list";
	}
}
