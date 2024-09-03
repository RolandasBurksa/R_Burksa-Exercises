package section_31_Java_Tips;

class Player {
    private String name;
    private static int count = 0;

    public Player(String name) {
        super();
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class StaticModifierRunner {

    public static <PlayerRunnerTwo> void main(String[] args) {
//        PlayerRunnerTwo player1 = new PlayerRunnerTwo("Ronaldo");

//        System.out.println(PlayerRunnerTwo.getCount());

//        PlayerRunnerTwo player2 = new PlayerRunnerTwo("Federer");
//        System.out.println(player1.getCount());
//        System.out.println(PlayerRunnerTwo.getCount());

    }
}
