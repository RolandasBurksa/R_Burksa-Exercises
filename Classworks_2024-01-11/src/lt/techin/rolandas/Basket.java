package lt.techin.rolandas;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();

    public void putProducts(Product product){
        products.add(product);
    }
    public ArrayList<Product> getBasket(){
        return products;
    }
}
