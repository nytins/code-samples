package com.nytins.spring.core.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nytins/spring/core/car/car.xml");

		Car car = (Car) context.getBean("car");
		car.drive();
	}
}
