package dev.exchange;


import java.util.Scanner;

import dev.exchange.domain.Currencys;
import dev.exchange.service.CalExchange;

public class Main {

	
	public static void main(String[] args) {

		
		CalExchange calExchange= new CalExchange();
		Currencys currencys =new Currencys();
		
		Scanner in = new Scanner(System.in); 
		System.out.print("통화 입력 : ");
		String currency= in.nextLine().toUpperCase();
		System.out.print("금액 입력 : ");
		double Money=in.nextDouble();
	
		
		currencys = calExchange.setCurrency(currency, Money);
	

		if (currency.equals("KRW")) {
		    System.out.printf("USD : %.3f%n", currencys.getUSD());
		    System.out.printf("EUR : %.3f%n", currencys.getEUR());
		    System.out.printf("JPY : %.3f%n", currencys.getJPY());
		    System.out.printf("CNY : %.3f%n", currencys.getCNY());
		} else if (currency.equals("USD")) {
		    System.out.printf("KRW : %.3f%n", currencys.getKRW());
		    System.out.printf("EUR : %.3f%n", currencys.getEUR());
		    System.out.printf("JPY : %.3f%n", currencys.getJPY());
		    System.out.printf("CNY : %.3f%n", currencys.getCNY()); 
		} else if (currency.equals("EUR")) {
		    System.out.printf("KRW : %.3f%n", currencys.getKRW());
		    System.out.printf("USD : %.3f%n", currencys.getUSD());
		    System.out.printf("JPY : %.3f%n", currencys.getJPY());
		    System.out.printf("CNY : %.3f%n", currencys.getCNY());
		} else if (currency.equals("JPY")) {
		    System.out.printf("KRW : %.3f%n", currencys.getKRW());
		    System.out.printf("USD : %.3f%n", currencys.getUSD());
		    System.out.printf("EUR : %.3f%n", currencys.getEUR());
		    System.out.printf("CNY : %.3f%n", currencys.getCNY());
		} else if (currency.equals("CNY")) {
		    System.out.printf("KRW : %.3f%n", currencys.getKRW());
		    System.out.printf("USD : %.3f%n", currencys.getUSD());
		    System.out.printf("EUR : %.3f%n", currencys.getEUR());
		    System.out.printf("JPY : %.3f%n", currencys.getJPY());
		} else {
		    System.out.println("지원되지 않는 통화입니다.");
		}
	}
}


