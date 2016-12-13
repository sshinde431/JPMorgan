package com.jpmorgan.example.stockMarket;


public class Trade {
	
	private TradeClassification type;
	private Integer quantity;
	private Double price;
	
	public Trade(TradeClassification type, Integer quantity, Double price) {
		this.setType(type);
		this.setQuantity(quantity);
		this.setPrice(price);
	}
	
	public TradeClassification getType() {
		return type;
	}

	public void setType(TradeClassification type) {
		this.type = type;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Trade (" + type + ", " + quantity + ","
				+ price + ")";
	}
}
