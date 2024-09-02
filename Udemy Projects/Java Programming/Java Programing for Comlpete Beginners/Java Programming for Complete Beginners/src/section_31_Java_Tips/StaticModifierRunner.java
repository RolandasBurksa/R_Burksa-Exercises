package section_31_Java_Tips;

class Player {
    private String name;
    private static int count;

    public Player(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticModifierRunner {

    public static void main(String[] args) {
        Player player1 = new Player("Ronaldo");

        System.out.println(Player.getCount());

        Player player2 = new Player("Federer");
//        System.out.println(player1.getCount());
        System.out.println(Player.getCount());

    }
}
