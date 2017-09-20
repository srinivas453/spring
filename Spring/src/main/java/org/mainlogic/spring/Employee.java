package org.mainlogic.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class Employee {
	
	@Inject
	private PropertiesLoader loader;
	
	@Value("${id}")
	public int id;
	
	@Value("${name}")
	public String name;

	public Integer getId() {
		return id;//loader.getProperty("id", Integer.class);
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;//loader.getProperty("name", String.class);
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

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {}
	
}
