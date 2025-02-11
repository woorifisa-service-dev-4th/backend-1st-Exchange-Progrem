package dev.exchange.service;

import dev.exchange.domain.Currencys;

public class Usd {
	
	
	
	public double calUsd(String currency, double money) {
        double result = 0;

        switch (currency) {
            case "KRW": // 대한민국 원화
                result = money * 0.00068694; // 1 KRW = 0.00068694 USD
                break;
            case "EUR": // 유로
                result = money * 1.0865; // 1 EUR = 1.0865 USD
                break;
            case "JPY": // 일본 엔화
                result = money * 0.0069257; // 1 JPY = 0.0069257 USD
                break;
            case "CNY": // 중국 위안화
                result = money * 0.13689; // 1 CNY = 0.13689 USD
                break;
            default:
                System.out.println("지원되지 않는 통화입니다.");
                break;
        }

        return result;
    }
}
