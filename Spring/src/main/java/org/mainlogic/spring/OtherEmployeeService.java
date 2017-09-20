package org.mainlogic.spring;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@DefaultService("OtherEmployeeService")
public class OtherEmployeeService extends BaseService {

	@Inject
	private Employee employee;

	public String getName() {

		return employee.getName();
	}
	
	public Integer getId() {
		
		return employee.getId();
	}
}