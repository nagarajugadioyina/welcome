package com.naga;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
		AdditionBean ab=(AdditionBean)ctx.getBean("id1");
		ab.printAddition();
		
		
		
	}

}
