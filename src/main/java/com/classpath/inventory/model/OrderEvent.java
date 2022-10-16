package com.classpath.inventory.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class OrderEvent {
	
	private final  Event event;
	private final Order payload;
	private LocalDateTime timestamp;
	

}
