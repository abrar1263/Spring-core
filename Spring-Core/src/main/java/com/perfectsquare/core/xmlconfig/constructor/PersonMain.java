package com.perfectsquare.core.xmlconfig.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
				
//				Person person = applicationcontext.getBean(Person.class);
//				Person person = applicationcontext.getBean("person",Person.class);
				Person person = (Person) applicationcontext.getBean("person");
				
				System.out.println(person);
	}
}
