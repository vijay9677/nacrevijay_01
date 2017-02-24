package com.nacre.Bean;
import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;
import javax.management.relation.RoleList;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
	final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("resources/spring.xml");
		//BeanFactory bf = new XmlBeanFactory(resource);
		ApplicationContext ac = new ClassPathXmlApplicationContext("resources/spring.xml");
/*		ac.getBean("serviceImpl");
*/	//	Logger l = 
	Object o =	ac.getBean("serviceImpl");//bf.getBean("mB");
/*	Object o1 =	ac.getBean("mB");//bf.getBean("mB");
	Object o2 =	ac.getBean("mB");//bf.getBean("mB");
*///	RoleList list = new RoleList();
	
//	List l = new ArrayList();
			
	//Role r = new Role("Admin",l );
	
	
			//list.add(role);
	//logs a debug message
	if(logger.isDebugEnabled()){
	    logger.debug("This is debug");
	}
	if(logger.isInfoEnabled()){
		logger.info("This is info : " +o);
	}

	logger.warn("This is warn : " + o);
	logger.fatal("This is fatal : " + o);

	//logs an error message with parameter
	logger.error("This is error : " +o);

	//logs an exception thrown from somewhere
	logger.trace("THIS IS TRACE "+o);
	
	}
}
