package com.perfectsquare.spring.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfig.class);
		BeanFactory beanfactory = new AnnotationConfigApplicationContext(ArtistConfig.class);
		
		Artist artist = beanfactory.getBean("MyArtist",Artist.class);
		
		System.out.println(artist);
		
	}

}
