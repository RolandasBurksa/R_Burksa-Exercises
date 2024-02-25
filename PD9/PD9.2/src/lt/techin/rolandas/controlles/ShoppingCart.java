package lt.techin.rolandas.controlles;

import lt.techin.rolandas.products_groups.AbstractProduct;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<AbstractProduct> items = new ArrayList<>();

    public void addItem(AbstractProduct item){
        items.add(item);
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (AbstractProduct element : items){
            totalPrice += element.getPrice();
        }
        return Math.round(totalPrice * 100) / 100.0;
    }

    public  double getTotalPriceWithVat() {
        double totalPriceWithVat = 0;
        for (AbstractProduct element : items) {
            totalPriceWithVat += element.getPriceWithVat();
        }
        return totalPriceWithVat;
    }
    public double getPriceInUSD(double currencyExchange){
        return Math.round();
    }

    }

