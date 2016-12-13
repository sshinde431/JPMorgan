package com.jpmorgan.example.stockMarket;

import java.util.Date;
import java.util.SortedMap;
import java.util.TreeMap;

public class StockCalculator {
	private static final double DEFAULT_DIVIDEND = 0.0;

	public static Double calculateVolumeWeightedStockPrice(TreeMap<Date, Trade> givenTrades) {
		Date now = new Date();
		
		Date startTime = new Date(now.getTime() - (15 * 60 * 1000));
		
		SortedMap<Date, Trade> trades = givenTrades.tailMap(startTime);
		
		Double volumeWeigthedStockPrice = 0.0;
		Integer totalQuantity = 0;
		for (Trade trade: trades.values()) {
			totalQuantity += trade.getQuantity();
			volumeWeigthedStockPrice += trade.getPrice() * trade.getQuantity();
		}
		return volumeWeigthedStockPrice/totalQuantity;
	}
	
	public static Double dividend(Double price, Double lastDividend, Double fixedDividend, Double parValue, StockClassification stockType) {
		switch(stockType) {
			case COMMON:
				return lastDividend/price;
			case PREFERRED:
				return fixedDividend*parValue/price;
			default:
				return DEFAULT_DIVIDEND;
		}
	}
	public static Double PERatio(Double price, Double lastDividend) {
		return price/lastDividend;
	}
	
	public static void buy(Integer quantity, Double price, TreeMap<Date, Trade> trades) {
		Trade trade = new Trade(TradeClassification.BUY, quantity, price);
		trades.put(new Date(), trade);
	}

	public static void sell(Integer quantity, Double price,TreeMap<Date, Trade> trades) {
		Trade trade = new Trade(TradeClassification.SELL, quantity, price);
		trades.put(new Date(), trade);		
	}
	public static Double getPrice(TreeMap<Date, Trade> trades) {
		if (trades.size() > 0) {
			return trades.lastEntry().getValue().getPrice();
		} else {
			return 0.0;
		}
	}
}
