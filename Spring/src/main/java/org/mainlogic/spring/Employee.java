package org.mainlogic.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Employee {

	@Value("${id}")
	public int id;
	
	@Value("${name}")
	public String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@PostConstruct
	public void afterInit() {
		
		System.out.println("In employee post create");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		
		System.out.println("In employee pre destroy");
	}
}
