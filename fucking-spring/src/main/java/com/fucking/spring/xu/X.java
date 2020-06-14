package com.fucking.spring.xu;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class X implements ApplicationContextAware {

	@Autowired
	public Y y;


	public X() {
		System.out.println("XXXXXXXXXXXXXXX  create");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("XXXXXXX  aware");
	}


	@PostConstruct
	public void postX(){

		System.out.println("XXXXXX post");
	}



	public void fuckAop(){
		System.out.println("today today------------------");
	}


}
