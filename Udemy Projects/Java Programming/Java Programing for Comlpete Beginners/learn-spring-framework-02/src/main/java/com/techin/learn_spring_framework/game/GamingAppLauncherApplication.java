package com.techin.learn_spring_framework.game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {

//    @Bean
//    public GamingConsole game() {
//        var game = new PacManGame();
//        return game;
//    }

//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        System.out.println("Parameter: " + game);
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    public static void main(String[] args) {

       try ( var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

           context.getBean(GamingConsole.class).up();

           context.getBean(GameRunner.class).run();
       }
    }
}
