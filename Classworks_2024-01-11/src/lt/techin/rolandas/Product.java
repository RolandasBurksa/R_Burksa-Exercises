package lt.techin.rolandas;

public abstract class Product {
    private String name;  // Private tam, kad klaseje metodai nekistu
    private double price;
    private int vat;  // % ??  21-->0.21 imame procentus

    public Product(String name, double price, int vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public double getPrice(){
        return price;
    }

    public double getPriceWithVat(){
        return price + (price * vat / 100);
    }

    public abstract String getDescription();

}
