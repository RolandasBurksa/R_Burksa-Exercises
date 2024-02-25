package lt.techin.rolandas;

public class Medicine extends  Product{
    public Medicine(String name, double price, int vat) {
        super(name, price, vat);
    }

    @Override
    public String getDescription() {
        return "........";
    }
}
