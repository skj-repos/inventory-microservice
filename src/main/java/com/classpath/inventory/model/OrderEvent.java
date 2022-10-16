package com.classpath.inventory.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class OrderEvent {
	
	private  Event event;
	private Order payload;
	private LocalDateTime timestamp;
	

}
