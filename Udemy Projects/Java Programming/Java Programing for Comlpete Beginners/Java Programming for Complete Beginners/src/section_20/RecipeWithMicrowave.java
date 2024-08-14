package section_20;

public class RecipeWithMicrowave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("***** ***** ***** ***** *****");
        System.out.println("Get the raw materials");
        System.out.println("Get what you need");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("Get stuff ready");
        System.out.println("Put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utensils");
        System.out.println("Switch off the microwave");
    }
}
