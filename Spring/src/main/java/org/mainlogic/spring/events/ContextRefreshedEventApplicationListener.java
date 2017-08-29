package org.mainlogic.spring.events;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextRefreshedEventApplicationListener {

	@EventListener
	public void processEvent(ContextRefreshedEvent cse) {
		System.out.println("context re-freshed event. ");
	}
}