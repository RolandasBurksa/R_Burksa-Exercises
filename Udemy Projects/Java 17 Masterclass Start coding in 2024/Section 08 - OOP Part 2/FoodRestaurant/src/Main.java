public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.5);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item abc = new Item("avocado", "avocado", 1.5);
//        abc.printItem();
//
//        Item def = new Item("side", "nothing", 2.0);
//        def.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        Order regularMeal = new Order();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        Order secondMeal = new Order("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}
