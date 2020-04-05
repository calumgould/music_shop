import behaviours.ISell;
import items.Item;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<ISell>();
    }

    public int getAmountOfStock(){
        return this.stock.size();
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item){
        this.stock.remove(item);
    }

    public double calculateTotalPotentialProfit(){
        double total = 0;
        for (ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
