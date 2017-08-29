package org.mainlogic.spring;

import org.mainlogic.spring.events.CustomApplicationEvent;
import org.mainlogic.spring.events.CustomApplicationEventPublisher;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {

		// AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//System.out.println(context.getBeanFactory().resolveEmbeddedValue("${course}"));

		EmployeeServiceComponent emp = context.getBean(EmployeeServiceComponent.class);
		
		System.out.println("Name: " + emp.getName());
		
		CustomApplicationEventPublisher publisher = context.getBean(CustomApplicationEventPublisher.class);
		CustomApplicationEvent event = new CustomApplicationEvent(publisher, "Order created with ID XXXX");
		publisher.publishEvent(event);
		
		context.close();
	}

}
