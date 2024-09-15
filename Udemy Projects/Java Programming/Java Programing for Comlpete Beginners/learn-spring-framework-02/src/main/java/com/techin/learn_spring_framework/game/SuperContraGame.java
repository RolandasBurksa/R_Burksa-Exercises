package com.techin.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class SuperContraGame implements GamingConsole{

    public void up() { System.out.println("up SuperContra is running.."); }
    public void down() {
        System.out.println("Sid down");
    }
    public void left() {
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("Shoot a bullet");
    }
}