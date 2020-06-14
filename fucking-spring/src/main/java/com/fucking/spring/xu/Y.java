package com.fucking.spring.xu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Y {

	@Autowired
	public X x;

	public Y(){
		System.out.println("YYYYYYYYYYYYYYYYYY  create");
	}


}
