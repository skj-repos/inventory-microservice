package com.classpath.inventory.service;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.classpath.inventory.event.OrderEvent;

@Component
public class OrderProcessor {
	
	@Bean
	public Consumer<Message<OrderEvent>> consumer() {
	    return message -> System.out.println("process the order " + message);
	}

	

}
