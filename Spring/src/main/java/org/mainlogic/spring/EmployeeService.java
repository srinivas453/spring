package org.mainlogic.spring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

@Named("EmployeeService")
@Qualifier
public class EmployeeService extends BaseService {

	@Inject
	private Employee employee;
	
	public String getName() {
		
		return employee.getName();
	}
}
