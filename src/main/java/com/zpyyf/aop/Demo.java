package com.zpyyf.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Radius on 2015/8/19.
 * demo
 */
@Component("demo")
public class Demo implements Test {

	public void test() {
		System.out.println("test");
	}

	public void test1() {
		System.out.println("test1");
	}

	public static void main(String[] args) {
		Test test = (Test) new ClassPathXmlApplicationContext("app.xml").getBean("demo");
		test.test();
		test.test1();
	}
}
