package com.techin.learn_spring_framework;

import com.techin.learn_spring_framework.game.GameRunner;
import com.techin.learn_spring_framework.game.MarioGame;
import com.techin.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
