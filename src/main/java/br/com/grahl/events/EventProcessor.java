package br.com.grahl.events;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventProcessor {

	@Autowired
	private EventPublisher publisher;

	public void process() {
		for (int x = 0; x < 5; x++) {
			MyEventPayload payload = new MyEventPayload();
			payload.setId(UUID.randomUUID().toString());
			payload.setValue(10);

			MyEvent event = new MyEvent(this, payload);
			publisher.publish(event);
		}
	}

}
