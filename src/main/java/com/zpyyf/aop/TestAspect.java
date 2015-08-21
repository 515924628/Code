package com.zpyyf.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Radius on 2015/8/19.
 * aop
 */
@Component("test")
@Aspect
public class TestAspect {

	@Pointcut("execution(* com.zpyyf.aop.Demo.*())")
	public void a() {}

	@After("a()")
	public void after(){
		System.out.println("after");
	}
}
