package lt.techin.rolandas;

public class Main {

    public static void main(String[] args) {
        Square square = new Square(10);
        System.out.println(square.countArea());
        square.getInfo();

        Circle circle = new Circle(10);
        circle.getInfo();
        System.out.println(circle.countArea());
    }
        // Shop
        Medicine panadol = new Medicine("Panadol", 2.45, 5);
        Fruit bananas = new Fruit("Bananas", 1.20, 21);
        Newspaper lr = new Newspaper("Lietuvos", 2.50, 9);
//
//        // Client
        Basket clientBasket = new Basket();
//        clientBasket.putProducts(panadol);
//        clientBasket.putProducts(bananas);
//        clientBasket.putProducts(lr);
//        System.out.println(clientBasket.getBasket());

    }