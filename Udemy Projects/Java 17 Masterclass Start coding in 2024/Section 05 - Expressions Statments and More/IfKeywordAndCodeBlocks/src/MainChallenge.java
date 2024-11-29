public class MainChallenge {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int scoreChal = 10000;
        int levelCompletedChal = 8;
        int bonusChal = 200;

        int finalScore = score;
        int finalScoreChal = scoreChal;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);

            finalScoreChal += (levelCompletedChal * bonusChal);
            System.out.println("Your final score was: " + finalScoreChal);
        }
    }

    public static void calculateScore() {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }

    }

}
