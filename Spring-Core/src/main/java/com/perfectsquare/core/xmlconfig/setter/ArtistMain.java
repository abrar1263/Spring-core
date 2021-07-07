package com.perfectsquare.core.xmlconfig.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("applicationContext-Setter.xml");
		
		Artist artist = applicationcontext.getBean(Artist.class);
		
		System.out.println(artist);
	}

}
