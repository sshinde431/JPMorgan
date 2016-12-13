package com.jpmorgan.example.stockMarket;

import java.util.Map;

public class GBCECalculator {

	public static Double gbceAllShareIndex(Map<String, Stock> stocks) {
		Double allShareIndex = 0.0;
		for (Stock stock : stocks.values()) {
			allShareIndex += StockCalculator.getPrice(stock.getTrades());
		}
		return Math.pow(allShareIndex, 1.0 / stocks.size());
	}

}
