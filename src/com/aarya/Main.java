package com.aarya;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        GameContainer container = new GameContainer(new GameManager());
        container.start();
    }
}
