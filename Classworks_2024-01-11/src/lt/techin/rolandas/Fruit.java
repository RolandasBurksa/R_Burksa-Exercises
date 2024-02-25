package lt.techin.rolandas;

public class Fruit extends  Product{

    public Fruit(String name, double price, int vat) {
        super(name, price, vat);
    }

    @Override
    public String getDescription() {
        return "____";
    }
}
