package org.mainlogic.spring.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationEventPublisher  {//implements ApplicationEventPublisherAware {

	@Autowired
    private ApplicationEventPublisher applicationEventPublisher;
 
    public void publishEvent(ApplicationEvent event) {
        
    	System.out.println("Publishing custom event. ");
        
        applicationEventPublisher.publishEvent(event);
    }

	/*@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.applicationEventPublisher = applicationEventPublisher;		
	}*/
}
