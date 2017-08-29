package org.mainlogic.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(value="employee")
	public Employee getEmployee() {
		
		return new Employee();
	}
}
