package br.com.grahl.events;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerEmail implements ApplicationListener<MyEvent> {

	@Override
	public void onApplicationEvent(MyEvent event) {
		//System.out.println("Vai mandar email: " + event.getPayload().getId() + ": " + new Date());
	}

}
