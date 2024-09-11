package com.techin.learn_spring_framework;

import com.techin.learn_spring_framework.game.GameRunner;
import com.techin.learn_spring_framework.game.PacManGame;

public class App01GamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();

        var game = new PacManGame();  //1: Object creation

        var gameRunner = new GameRunner(game);  //2: Object creation + Wiring of Dependencies
        gameRunner.run();
    }
}
