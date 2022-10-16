package com.classpath.inventory.processor;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

import com.classpath.inventory.model.OrderEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OrderProcessor {
	
	@StreamListener(Sink.INPUT)
	public void processOrder(OrderEvent orderEvent) {
		log.info("payload processor :: "+ orderEvent);
	}
}
