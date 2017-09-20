package org.mainlogic.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(value= {AppParentConfig.class})
@ComponentScan(basePackages= {"org.mainlogic.spring"})
//@PropertySource("classpath:application.properties")
public class AppConfig {

}









/*	@Bean
	public Employee getEmployee() {
		
		return new Employee(100, "Spring");
	}
	
	@Bean("EmployeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeService service = new EmployeeService();
		service.setEmployee(getEmployee());
		
		return service;
	}
	
	@Bean("EmployeeService1")
	public EmployeeService getEmployeeService1() {
		
		EmployeeService service = new EmployeeService();
		service.setEmployee(getEmployee());
		
		return service;
	}*/
