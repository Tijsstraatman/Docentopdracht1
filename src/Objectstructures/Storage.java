package Objectstructures;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private List<Stock> stocks = new ArrayList<>();

    public List<Stock> getAllStocks(){
        return stocks;
    }


    public void addStock(Stock stockItem){
         stocks.add(stockItem);
    }
}
