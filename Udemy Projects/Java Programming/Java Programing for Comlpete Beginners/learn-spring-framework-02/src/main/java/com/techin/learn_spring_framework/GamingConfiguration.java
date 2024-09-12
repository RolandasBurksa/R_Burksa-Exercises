package com.techin.learn_spring_framework;

import com.techin.learn_spring_framework.game.GameRunner;
import com.techin.learn_spring_framework.game.GamingConsole;
import com.techin.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }

}
