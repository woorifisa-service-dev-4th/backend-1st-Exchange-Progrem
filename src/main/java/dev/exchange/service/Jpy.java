package dev.exchange.service;

import dev.exchange.domain.Currencys;

public class Jpy {
	public double CalJpy(String currency, double money) {
        double result = 0;

        switch (currency) {
            case "KRW": // 원화 → 엔화
                result = money * 0.0096;  // 1 KRW = 0.0096 JPY
                break;
            case "EUR": // 유로 → 엔화
                result = money * 155.67;  // 1 EUR = 155.67 JPY
                break;
            case "USD": // 달러 → 엔화
                result = money * 148.22;  // 1 USD = 148.22 JPY
                break;
            case "CNY": // 위안 → 엔화
                result = money * 21.25;  // 1 CNY = 21.25 JPY
                break;
            default:
                System.out.println("지원되지 않는 통화입니다.");
                break;
        }

        return result;
    }	
}
