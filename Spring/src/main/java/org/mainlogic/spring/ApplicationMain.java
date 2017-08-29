package org.mainlogic.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee emp = (Employee) context.getBean("employee");

		System.out.println(emp);

		context.close();
	}

}
