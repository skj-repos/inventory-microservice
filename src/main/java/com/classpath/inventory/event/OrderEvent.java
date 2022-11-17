package com.classpath.inventory.event;

import java.time.LocalDateTime;

import com.classpath.inventory.model.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class OrderEvent {
	
	private Order order;
	private OrderStatus status;
	private LocalDateTime timestamp;

}
