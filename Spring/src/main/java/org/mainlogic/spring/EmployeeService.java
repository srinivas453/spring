package org.mainlogic.spring;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@DefaultService("EmployeeService")
public class EmployeeService extends BaseService {

	@Inject
	private Employee employee;
	
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getName() {
		
		return "EMPService:" +employee.getName();
	}
	
	public Integer getId() {
		
		return employee.getId();
	}
}
