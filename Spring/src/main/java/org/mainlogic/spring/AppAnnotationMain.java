package org.mainlogic.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppAnnotationMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext parent = new AnnotationConfigApplicationContext(AppParentConfig.class);
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.setParent(parent);

		Employee emp = parent.getBean(Employee.class);
		
		System.out.println(emp.getName());
		
		context.close();
	}
}
