package dev.exchange.service;

public class Cny {
	
	public double CalCny(String currency, double money) {
        double result = 0;

        switch (currency) {
            case "KRW": // 원화 → 위안화
                result = money * 0.0051;  // 1 KRW = 0.0051 CNY
                break;
            case "EUR": // 유로 → 위안화
                result = money * 7.66;  // 1 EUR = 7.66 CNY
                break;
            case "JPY": // 엔화 → 위안화
                result = money * 0.048;  // 1 JPY = 0.048 CNY
                break;
            case "USD": // 달러 → 위안화
                result = money * 7.14;  // 1 USD = 7.14 CNY
                break;
            default:
                System.out.println("지원되지 않는 통화입니다.");
                break;
        }

        return result;
    }	
}
