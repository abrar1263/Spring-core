package com.perfectsquare.spring.XMLConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
		
		
		/// 1.intatiating the Spring Ioc  container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2 . get the bean information from spring Ioc
		Product product = applicationContext.getBean("product1",Product.class);
		
		// 3 . use the bean
		System.out.println(product);
	}
}
