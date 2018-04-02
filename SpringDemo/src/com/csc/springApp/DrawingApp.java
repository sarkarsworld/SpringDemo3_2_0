/**
 * 
 */
package com.csc.springApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * @author asarkar28
 *
 */
public class DrawingApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Without Springs
		 
		 Triangle triangle = new Triangle();
		triangle.draw();
		*/
		
		//XmlBeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
