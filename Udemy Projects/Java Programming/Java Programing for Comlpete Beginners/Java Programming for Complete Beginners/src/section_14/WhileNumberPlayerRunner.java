package section_14;

public class WhileNumberPlayerRunner {

    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(90);

        player.printSquaresUptoLimit();
        // For limit = 30, output would be 1 4 9 16 25

        player.printCubesUptoLimit();
        // For limit = 30 , output would be 1 8 27

    }
}
