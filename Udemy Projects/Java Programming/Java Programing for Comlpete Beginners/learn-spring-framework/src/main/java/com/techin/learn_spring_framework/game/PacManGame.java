package com.techin.learn_spring_framework.game;

public class PacManGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Get up");
    }

    @Override
    public void down() {
        System.out.println("Get down");
    }

    @Override
    public void left() {
        System.out.println("Go left");
    }

    @Override
    public void right() {
        System.out.println("Go right");
    }
}
