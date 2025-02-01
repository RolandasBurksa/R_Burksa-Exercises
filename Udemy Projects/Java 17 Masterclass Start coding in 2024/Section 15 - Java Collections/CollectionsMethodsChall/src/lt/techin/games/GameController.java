package lt.techin.games;

import lt.techin.games.poker.PokerGame;

public class GameController {

    public static void main(String[] args) {

        PokerGame fiveCardsDraw = new PokerGame(4, 5);
        fiveCardsDraw.startPlay();
    }
}
