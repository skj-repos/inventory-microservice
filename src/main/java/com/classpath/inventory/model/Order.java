package com.classpath.inventory.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public class Order {
	private long id;
	private String name;
	private String email;
	private double price;
	private LocalDate orderDate;
}
