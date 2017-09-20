package org.mainlogic.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"org.mainlogic.spring"})
@PropertySource("classpath:application.properties")
public class AppParentConfig {

}