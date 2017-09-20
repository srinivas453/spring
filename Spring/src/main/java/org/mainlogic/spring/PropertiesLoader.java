package org.mainlogic.spring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.core.env.Environment;

@Named
public class PropertiesLoader {

	@Inject
	private Environment env;
	
	public <T> T getProperty(String name, Class<T> clazz) {
		
		return env.getProperty(name, clazz);
	}
}
