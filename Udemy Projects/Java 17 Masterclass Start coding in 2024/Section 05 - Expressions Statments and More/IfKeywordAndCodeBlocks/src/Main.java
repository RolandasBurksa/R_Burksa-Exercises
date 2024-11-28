public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("1 - Your score was: " + score);
        } else if (score < 1000) {
            System.out.println("2 - Your score is less then 1000, score: " + score );
        } else {
            System.out.println("3 - Got there!.");
        }
    }
}
