package dev.exchange.service;

import dev.exchange.domain.Currencys;

public class Krw {
	
	
	public double calKrw(String currency, double money) {
        double result = 0;

        switch (currency.toUpperCase()) {
            case "USD":
                result = money * 1453.00; // USD -> KRW
                break;
            case "EUR":
                result = money * 1496.76; // EUR -> KRW
                break;
            case "JPY":
                result = money * 9.58; // JPY -> KRW
                break;
            case "CNY":
                result = money * 198.89; // CNY -> KRW
                break;
            default:
                System.out.println("지원되지 않는 통화입니다.");
                break;
        }

        return result;
    }
	
	

}
