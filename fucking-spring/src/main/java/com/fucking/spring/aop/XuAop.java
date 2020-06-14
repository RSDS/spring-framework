package com.fucking.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XuAop {


	@Pointcut("within(com.fucking.spring.xu..*)")
	public void sssss() {

	}


	@Before("com.fucking.spring.aop.XuAop.sssss()")
	public void doAccessCheck() {

		System.out.println("fuck aop----------------");

	}

}
