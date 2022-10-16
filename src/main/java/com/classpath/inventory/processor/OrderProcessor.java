package com.classpath.inventory.processor;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.classpath.inventory.model.Event;
import com.classpath.inventory.model.Order;
import com.classpath.inventory.model.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderProcessor {
	
	private Source source;
	
	@StreamListener(Sink.INPUT)
	public void processOrder(OrderEvent orderEvent) {
		log.info("payload processor :: "+ orderEvent);
		Order savedOrder = orderEvent.getPayload();

		if(savedOrder.getPrice() > 5000) {
			//generate an new event
			OrderEvent event = new OrderEvent(Event.ORDER_CANCELLED, orderEvent.getPayload());
			this.source.output().send(MessageBuilder.withPayload(event).build());
		} else {
			
		}
	}
}
