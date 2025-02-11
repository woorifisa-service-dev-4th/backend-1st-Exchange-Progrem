package dev.exchange.service;

public class Eur {
	
	
	
	public double CalEur(String currency, double money) {
	    double result = 0;

	    switch (currency) {
	        case "KRW": // 원화 → 유로
	            result = money * 0.00072;  // 1 KRW = 0.00072 EUR
	            break;
	        case "USD": // 달러 → 유로
	            result = money * 0.93;  // 1 USD = 0.93 EUR
	            break;
	        case "JPY": // 엔화 → 유로
	            result = money * 0.0067;  // 1 JPY = 0.0067 EUR
	            break;
	        case "CNY": // 위안 → 유로
	            result = money * 0.13;  // 1 CNY = 0.13 EUR
	            break;
	        default:
	            System.out.println("지원되지 않는 통화입니다.");
	            break;
	    }

	    return result;
	}
	

}
