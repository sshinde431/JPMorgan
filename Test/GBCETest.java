package com.jpmorgan.example.stockMarket;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import com.jpmorgan.example.stockMarket.GBCECalculator;
import com.jpmorgan.example.stockMarket.Stock;
import com.jpmorgan.example.stockMarket.StockClassification;

public class GBCETest {

	@Test
	public void testAllShareIndex() {
        HashMap<String, Stock> db = new HashMap<String, Stock>();
        db.put("TEA", new Stock("TEA", StockClassification.COMMON, 0.0, 0.0, 100.0));
        db.put("POP", new Stock("POP", StockClassification.COMMON, 8.0, 0.0, 100.0));
        db.put("ALE", new Stock("ALE", StockClassification.COMMON, 23.0, 0.0, 60.0));
        db.put("GIN", new Stock("GIN", StockClassification.PREFERRED, 8.0, 0.2, 100.0));
        db.put("JOE", new Stock("JOE", StockClassification.COMMON, 13.0, 0.0, 250.0));
        for (Stock stock: db.values()) {
            
        	for (int i=1; i <= 10; i++) {
        		StockCalculator.buy(1, 1.0,stock.getTrades());
        		StockCalculator.sell(1, 1.0,stock.getTrades());
        	}
        }
        Double GBCEallShareIndex = GBCECalculator.gbceAllShareIndex(db);
        assertEquals(1.379729661461215, GBCEallShareIndex, 0.0);
	}

}
