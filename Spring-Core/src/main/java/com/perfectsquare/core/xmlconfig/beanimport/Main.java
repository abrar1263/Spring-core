package com.perfectsquare.core.xmlconfig.beanimport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-beanimport-artist.xml");
		System.out.println(applicationContext.getBean("artist", Artist.class));
	}

}
