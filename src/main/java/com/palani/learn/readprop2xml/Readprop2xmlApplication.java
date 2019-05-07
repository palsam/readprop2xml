package com.palani.learn.readprop2xml;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.palani.learn.readprop2xml.domain.Resource;

public class Readprop2xmlApplication {

	public static void main(String[] args) {
		String confFile = "applicationContext.xml";
		ConfigurableApplicationContext context
				= new ClassPathXmlApplicationContext(confFile);
		Resource myResource = (Resource) context.getBean("resource");
		System.out.println(myResource.toString());
		context.close();
	}
}
