package com.zpyyf;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTest {
	@Async
	public void test(){
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		AsyncTest test = (AsyncTest) new ClassPathXmlApplicationContext("app.xml")
				.getBean("asyncTest");
		test.test();
		System.out.println("end");
	}
}
