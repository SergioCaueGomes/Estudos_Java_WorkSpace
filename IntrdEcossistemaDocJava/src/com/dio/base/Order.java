package com.dio.base;

import java.math.BigDecimal;


/**
 *Representa um pedido
 *
 * @author SergioCaue
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 */

public class Order {
	
	private final String code;
	private final BigDecimal totalValue;
	

	
	
	/**
	 * Construtor da Classe
	 * @param code Código do Pedido
	 * @param totalValue Valor total do pedido
	 * 
	 */
	public Order(String code, BigDecimal totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}

	
//	public void printItems() {
// Estruturas de repetição		
		
// repet. FOR
//
//
//	for (int i = 0; i < items.length; i++) {
//		System.out.println(items[i]);
//	}

// repet. Enhanced FOR
//
//
//	for (String i : items) {
//		System.out.println(i);
//	}	
		
		
// Variavel		
//		int i = 0;
//
// repet. While
//
//
//		while (i < items.length) {
//			System.out.println(items[i]);
//			i++;
//		}

// repet. Do While
//
//
//		do {
//			System.out.println(items[i]);
//			i++;
//		} while(i<items.length);
//		
//	}
		
// Estruturas de decisão IF/Switch	
//
//
	
	
	
	/**
	 * Calcula as taxas de acordo com o valor total do pedido. Se o pedido for maior que $100,00 uma taxa é cobrada.
	 * @param val 
	 * 
	 * @return Valor total do pedido com as taxas.
	 * @throws RuntimeException Se o valor do pedido for negativo.
	 */
	public BigDecimal calculateFee(String val) throws RuntimeException {
		if(this.totalValue.signum() < 0) {
			throw new RuntimeException("O pedido não pode ter valor negativo");
		}

		if(this.totalValue.compareTo(new BigDecimal(val="100.00")) > 0) {
			return this.totalValue.multiply(new BigDecimal(val="0.99"));
		}
			
		
//		if(this.totalValue > 100) {
//			return this.totalValue * 0.99;
//		} else {
//			return this.totalValue;
//		}
//		
//		switch (this.totalValue) {
//			case 100: 
//				return totalValue * 0.99;
//			case 200: 
//				return totalValue * 1.99;
//		
//			default:
//				return totalValue;
//		}
////////////////////////////////////////////////
		return this.totalValue;
	}
}
