package org.mainlogic.spring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named
public class EmployeeServiceComponent {

	@Inject
	@DefaultService("OtherEmployeeService")
	private BaseService service;

	public String getName() {
		
		return service.getName();
	}
	
	public Integer getId() {
		
		return service.getId();
	}
}
