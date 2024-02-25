package lt.techin.rolandas.products_groups;

import lt.techin.rolandas.products_groups.AbstractProduct;

public class Medicine extends AbstractProduct {

    private static final double VAT = 1.05;

    public Medicine(String name, double price, double discount) {
        super(name, price, discount);
    }

    @Override
    public double getPriceWithVat() {
        return this.getPrice() * VAT;
    }


}
