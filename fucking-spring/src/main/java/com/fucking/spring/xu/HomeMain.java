package com.fucking.spring.xu;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.fucking.spring")
public class HomeMain {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(HomeMain.class);

		ac.getBean("x");
		X bean = ac.getBean(X.class);
		bean.fuckAop();


		System.out.println();


	}


}
