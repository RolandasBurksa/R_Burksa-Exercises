package com.techin.learn_spring_framework;

import com.techin.learn_spring_framework.game.GameRunner;
import com.techin.learn_spring_framework.game.GamingConsole;
import com.techin.learn_spring_framework.game.PacManGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {

       try ( var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

           context.getBean(GamingConsole.class).up();

           context.getBean(GameRunner.class).run();
       }
    }
}
