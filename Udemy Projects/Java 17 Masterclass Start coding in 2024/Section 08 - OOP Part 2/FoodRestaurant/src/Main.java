public class Main {

    public static void main(String[] args) {

        Item coke = new Item("drink", "coke", 1.5);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Item abc = new Item("avocado", "avocado", 1.5);
        abc.printItem();

        Item def = new Item("side", "nothing", 2.0);
        def.printItem();
    }
}
