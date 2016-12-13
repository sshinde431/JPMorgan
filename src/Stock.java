package com.jpmorgan.example.stockMarket;

import java.util.Date;
import java.util.TreeMap;

public class Stock {
	
	private String symbol;
	private StockClassification classification;
	private Double lastDividend;
	private Double fixedDividend;
	private Double parValue;
    private TreeMap<Date, Trade> trades;
    
	public Stock(String symbol, StockClassification type, Double lastDividend, Double fixedDividend, Double parValue) {
		this.setSymbol(symbol);
		this.setType(type);
		this.setLastDividend(lastDividend);
		this.setFixedDividend(fixedDividend);
		this.setParValue(parValue);
		this.trades = new TreeMap<Date, Trade>();
	}
	
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public StockClassification getType() {
		return classification;
	}

	public void setType(StockClassification type) {
		this.classification = type;
	}

	public Double getLastDividend() {
		return lastDividend;
	}

	public void setLastDividend(Double lastDividend) {
		this.lastDividend = lastDividend;
	}

	public Double getFixedDividend() {
		return fixedDividend;
	}

	public void setFixedDividend(Double fixedDividend) {
		this.fixedDividend = fixedDividend;
	}

	public Double getParValue() {
		return parValue;
	}

	public void setParValue(Double parValue) {
		this.parValue = parValue;
	}

	public TreeMap<Date, Trade> getTrades() {
		return trades;
	}

	public void setTrades(TreeMap<Date, Trade> trades) {
		this.trades = trades;
	}

	@Override
	public String toString() {
		return "Stock (" +symbol + ", " + classification + ","
				+ lastDividend + ", " + fixedDividend
				+ ", " + parValue + ")";
	}

}
