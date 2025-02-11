package dev.exchange.service;

import dev.exchange.domain.Currencys;

public class CalExchange {

	

	Currencys currencys = new Currencys();
	Krw krw=new Krw();
	Usd usd=new Usd();
	Eur eur=new Eur();
	Jpy jpy=new Jpy();
	Cny cny=new Cny();
	public Currencys setCurrency(String currency, double money) {
		
		if(currency.equals("KRW")) {
			currencys.setUSD(usd.calUsd(currency, money));
			currencys.setEUR(eur.CalEur(currency, money));
			currencys.setJPY(jpy.CalJpy(currency, money));
			currencys.setCNY(cny.CalCny(currency, money));
		}else if(currency.equals("USD")) {
			currencys.setKRW(krw.calKrw(currency, money));
			currencys.setEUR(eur.CalEur(currency, money));
			currencys.setJPY(jpy.CalJpy(currency, money));
			currencys.setCNY(cny.CalCny(currency, money));
		}else if(currency.equals("EUR")) {
			currencys.setKRW(krw.calKrw(currency, money));
			currencys.setUSD(usd.calUsd(currency, money));
			currencys.setJPY(jpy.CalJpy(currency, money));
			currencys.setCNY(cny.CalCny(currency, money));
		}else if (currency.equals("JPY")) {
			currencys.setKRW(krw.calKrw(currency, money));
			currencys.setUSD(usd.calUsd(currency, money));
			currencys.setEUR(eur.CalEur(currency, money));
			currencys.setCNY(cny.CalCny(currency, money));
		}else if (currency.equals("CNY")) {
			currencys.setKRW(krw.calKrw(currency, money));
			currencys.setUSD(usd.calUsd(currency, money));
			currencys.setEUR(eur.CalEur(currency, money));
			currencys.setJPY(jpy.CalJpy(currency, money));
		}
		

		return currencys;
	}
	
	
}
