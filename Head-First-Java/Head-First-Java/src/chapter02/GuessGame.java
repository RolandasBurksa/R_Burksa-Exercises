package chapter02;

public class GuessGame {
    String Player_p1;
    String Player_p2;
    String Player_p3;

    public void startGame() {
         GuessGame p1 = new GuessGame();
         GuessGame p2 = new GuessGame();
         GuessGame p3 = new GuessGame();

         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;

         boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.startGame();
            p2.startGame();
            p3.startGame();

        }

    }

}
