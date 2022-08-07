package com.dio;

import java.math.BigDecimal;

import com.dio.base.Order;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		
		
		
		Order order = new Order(code="code1234", totalValue="99.00");
		System.out.println(order);
	}
}
