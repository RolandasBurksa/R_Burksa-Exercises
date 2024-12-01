public class MainChallengeFourth {

    public static void main(String[] args) {

        String playerName = "Darius";
        int playerScore = 1500;

        displayHighScorePosition(playerName, playerScore);

        playerName = "Alius";
        playerScore = 800;

        displayHighScorePosition(playerName, playerScore);

        playerName = "Malius";
        playerScore = 100;

        displayHighScorePosition(playerName, playerScore);
    }

    public static void displayHighScorePosition(String playerName, int playerScore ) {

        System.out.println(playerName + " score is - " + playerScore + ", and he managed to get into position - " + calculateHighScorePosition(playerScore) + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
            return 4;
    }
}
