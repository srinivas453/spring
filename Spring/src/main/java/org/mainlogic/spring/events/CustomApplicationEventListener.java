package org.mainlogic.spring.events;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomApplicationEventListener { //implements ApplicationListener<CustomApplicationEvent> {
	//@Override
	@EventListener
	public void onApplicationEvent(CustomApplicationEvent event) {
		System.out.println("Received custom event - " + event.getMessage());
	}
}