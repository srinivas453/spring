package org.mainlogic.spring;

import org.mainlogic.spring.events.CustomApplicationEvent;
import org.mainlogic.spring.events.CustomApplicationEventPublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {

		ApplicationContext parent = new ClassPathXmlApplicationContext("parentContext.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"}, parent);
		
		//System.out.println(context.getBeanFactory().resolveEmbeddedValue("${course}"));

		EmployeeServiceComponent emp = parent.getBean(EmployeeServiceComponent.class);
		
		System.out.println("Name: " + emp.getName() + ", Id: " + emp.getId());
		
		CustomApplicationEventPublisher publisher = context.getBean(CustomApplicationEventPublisher.class);
		CustomApplicationEvent event = new CustomApplicationEvent(publisher, "Order created with ID XXXX");
		publisher.publishEvent(event);
		
		context.close();
	}

}
