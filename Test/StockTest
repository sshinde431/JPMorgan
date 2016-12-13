package com.jpmorgan.example.stockMarket;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.jpmorgan.example.stockMarket.Stock;
import com.jpmorgan.example.stockMarket.StockClassification;
import com.jpmorgan.example.stockMarket.Trade;
import com.jpmorgan.example.stockMarket.TradeClassification;
import com.jpmorgan.example.stockMarket.StockCalculator;

public class StockTest {

	@Test
	public void testDividend() {
        Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
        Stock stockGIN = new Stock("GIN", StockClassification.PREFERRED, 8.0, 0.2, 100.0);
        Stock stockTEA = new Stock("TEA", StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP = new Stock("POP", StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE = new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
        // Test dividend for Common
		Double dividendALE = StockCalculator.dividend(1.0,stockALE.getLastDividend(), stockALE.getFixedDividend(), stockALE.getParValue(), stockALE.getType());
		Double dividendTEA = StockCalculator.dividend(1.0, stockTEA.getLastDividend(), stockTEA.getFixedDividend(), stockTEA.getParValue(), stockTEA.getType());
		Double dividendPOP = StockCalculator.dividend(1.0, stockPOP.getLastDividend(), stockPOP.getFixedDividend(), stockTEA.getParValue(), stockTEA.getType());
		Double dividendJOE = StockCalculator.dividend(1.0, stockJOE.getLastDividend(), stockJOE.getFixedDividend(), stockTEA.getParValue(), stockTEA.getType());
		Double expectedDividendALE = stockALE.getLastDividend()/1.0;
		Double expectedDividendTEA = stockTEA.getLastDividend()/1.0;
		Double expectedDividendPOP = stockPOP.getLastDividend()/1.0;
		Double expectedDividendJOE = stockJOE.getLastDividend()/1.0;
		assertEquals(expectedDividendALE, dividendALE, 0.0);
		assertEquals(expectedDividendTEA,dividendTEA,0.0);
		assertEquals(expectedDividendPOP,dividendPOP,0.0);
		assertEquals(expectedDividendJOE,dividendJOE,0.0);
		// Test dividend for Preferred
		Double dividendGIN = StockCalculator.dividend(1.0,stockGIN.getLastDividend(), stockGIN.getFixedDividend(), stockGIN.getParValue(), stockGIN.getType());
		Double expectedDividendGIN = stockGIN.getFixedDividend()*stockGIN.getParValue()/1.0;
		assertEquals(expectedDividendGIN, dividendGIN, 0.0);
	}

	@Test
	public void testPERatio() {
        Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
        Stock stockTEA=new Stock("TEA",StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP=new Stock("POP",StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE=new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
        
        Double peRatioALE = StockCalculator.PERatio(1.0,stockALE.getLastDividend());
        Double peRatioTEA = StockCalculator.PERatio(1.0,stockTEA.getLastDividend());
        Double peRatioPOP = StockCalculator.PERatio(1.0,stockPOP.getLastDividend());
        Double peRatioJOE = StockCalculator.PERatio(1.0,stockJOE.getLastDividend());
        
        Double expectedPeRatioALE = 1.0/stockALE.getLastDividend();
        Double expectedPeRatioTEA = 1.0/stockTEA.getLastDividend();
        Double expectedPeRatioPOP = 1.0/stockPOP.getLastDividend();
        Double expectedPeRatioJOE = 1.0/stockJOE.getLastDividend();
        assertEquals(expectedPeRatioALE, peRatioALE, 0.0);
        assertEquals(expectedPeRatioTEA, peRatioTEA, 0.0);
        assertEquals(expectedPeRatioPOP, peRatioPOP, 0.0);
        assertEquals(expectedPeRatioJOE, peRatioJOE, 0.0);
	}

	@Test
	public void testBuy() {
		Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
		Stock stockTEA=new Stock("TEA",StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP=new Stock("POP",StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE=new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
		
        StockCalculator.buy(1, 10.0, stockALE.getTrades());
		StockCalculator.buy(1, 10.0, stockTEA.getTrades());
		StockCalculator.buy(1, 10.0, stockPOP.getTrades());
		StockCalculator.buy(1, 10.0, stockJOE.getTrades());
		
		assertEquals(10.0, StockCalculator.getPrice(stockALE.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockTEA.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockPOP.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockJOE.getTrades()), 0.0);
	}

	@Test
	public void testSell() {
		Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
		Stock stockTEA=new Stock("TEA",StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP=new Stock("POP",StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE=new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
		
        StockCalculator.sell(1, 10.0,stockALE.getTrades());
		StockCalculator.sell(1, 10.0,stockTEA.getTrades());
		StockCalculator.sell(1, 10.0,stockPOP.getTrades());
		StockCalculator.sell(1, 10.0,stockJOE.getTrades());
		
		assertEquals(10.0, StockCalculator.getPrice(stockALE.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockTEA.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockPOP.getTrades()), 0.0);
		assertEquals(10.0, StockCalculator.getPrice(stockJOE.getTrades()), 0.0);
	}

	@Test
	public void testGetPrice() {
		Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
		Stock stockTEA=new Stock("TEA",StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP=new Stock("POP",StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE=new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
		
        StockCalculator.sell(1, 10.0,stockALE.getTrades());
        StockCalculator.sell(1, 10.0,stockTEA.getTrades());
        StockCalculator.sell(1, 10.0,stockPOP.getTrades());
        StockCalculator.sell(1, 10.0,stockJOE.getTrades());
        
        StockCalculator.buy(1, 11.0, stockALE.getTrades());
        StockCalculator.buy(1, 11.0, stockTEA.getTrades());
        StockCalculator.buy(1, 11.0, stockPOP.getTrades());
        StockCalculator.buy(1, 11.0, stockJOE.getTrades());
        
        assertEquals(11.0, StockCalculator.getPrice(stockALE.getTrades()), 0.0);
        assertEquals(11.0, StockCalculator.getPrice(stockTEA.getTrades()), 0.0);
        assertEquals(11.0, StockCalculator.getPrice(stockPOP.getTrades()), 0.0);
        assertEquals(11.0, StockCalculator.getPrice(stockJOE.getTrades()), 0.0);
	}

	@Test
	public void testCalculateVolumeWeightedStockPrice() {
		Stock stockALE = new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0);
		Stock stockTEA=new Stock("TEA",StockClassification.COMMON,0.0,0.0,100.0);
        Stock stockPOP=new Stock("POP",StockClassification.COMMON,8.0,0.0,100.0);
        Stock stockJOE=new Stock("JOE",StockClassification.COMMON,13.0,0.0,250.0);
        
		StockCalculator.sell(2, 10.0, stockALE.getTrades());
		StockCalculator.sell(2, 10.0,stockTEA.getTrades());
        StockCalculator.sell(2, 10.0,stockPOP.getTrades());
        StockCalculator.sell(2, 10.0,stockJOE.getTrades());
		
		StockCalculator.buy(2, 10.0, stockALE.getTrades());
		StockCalculator.buy(2, 10.0, stockTEA.getTrades());
        StockCalculator.buy(2, 10.0, stockPOP.getTrades());
        StockCalculator.buy(2, 10.0, stockJOE.getTrades());
        
		Double volumeWeightedStockPriceALE = StockCalculator.calculateVolumeWeightedStockPrice(stockALE.getTrades());
		Double volumeWeightedStockPriceTEA = StockCalculator.calculateVolumeWeightedStockPrice(stockTEA.getTrades());
		Double volumeWeightedStockPricePOP = StockCalculator.calculateVolumeWeightedStockPrice(stockPOP.getTrades());
		Double volumeWeightedStockPriceJOE = StockCalculator.calculateVolumeWeightedStockPrice(stockJOE.getTrades());
		
		assertEquals(10.0, volumeWeightedStockPriceALE, 0.0);
		assertEquals(10.0, volumeWeightedStockPriceTEA, 0.0);
		assertEquals(10.0, volumeWeightedStockPricePOP, 0.0);
		assertEquals(10.0, volumeWeightedStockPriceJOE, 0.0);
		
		Date now = new Date();

		Date startTime = new Date(now.getTime() - (20 * 60 * 1000));
		stockALE.getTrades().put(startTime, new Trade(TradeClassification.BUY, 1, 20.0));
		stockTEA.getTrades().put(startTime, new Trade(TradeClassification.BUY, 1, 20.0));
		stockPOP.getTrades().put(startTime, new Trade(TradeClassification.BUY, 1, 20.0));
		stockJOE.getTrades().put(startTime, new Trade(TradeClassification.BUY, 1, 20.0));

		volumeWeightedStockPriceALE = StockCalculator.calculateVolumeWeightedStockPrice(stockALE.getTrades());
		volumeWeightedStockPriceTEA = StockCalculator.calculateVolumeWeightedStockPrice(stockTEA.getTrades());
		volumeWeightedStockPricePOP = StockCalculator.calculateVolumeWeightedStockPrice(stockPOP.getTrades());
		volumeWeightedStockPriceJOE = StockCalculator.calculateVolumeWeightedStockPrice(stockJOE.getTrades());

		assertEquals(10.0, volumeWeightedStockPriceALE, 0.0);
		assertEquals(10.0, volumeWeightedStockPriceTEA, 0.0);
		assertEquals(10.0, volumeWeightedStockPricePOP, 0.0);
		assertEquals(10.0, volumeWeightedStockPriceJOE, 0.0);
	}
}
