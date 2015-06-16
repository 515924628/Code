package com.zpyyf.service;

import org.springframework.stereotype.Service;

@Service("my")
public class MyServiceImpl implements BaseService {

	public void start() {
		System.out.println("start");
	}
}
