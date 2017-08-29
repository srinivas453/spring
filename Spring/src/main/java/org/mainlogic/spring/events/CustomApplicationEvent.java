package org.mainlogic.spring.events;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomApplicationEvent extends ApplicationEvent {

	private String message;
 
    public CustomApplicationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}