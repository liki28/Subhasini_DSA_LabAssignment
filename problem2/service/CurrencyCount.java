package com.gl.problem2.service;

public class CurrencyCount {
	
	public  void ImplementationOfNotesCount(int currency[],int amount) {
		
		int[] currencyCounter=new int[currency.length];
		
		try {
			for(int i=0;i<currency.length;i++) {
				if(amount>=currency[i]) {
					currencyCounter[i]=amount/currency[i];
					amount=amount%currency[i];//-currencyCounter[i]*currency[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cannot be given with the highest denomination");
			}else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for(int i=0;i<currency.length;i++) {
					if(currencyCounter[i]!=0) {
						System.out.println(currency[i]+":"+currencyCounter[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println(e+"currency of denomination 0 is invalid");
		}
	}

}
