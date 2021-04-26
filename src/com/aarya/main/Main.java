package com.aarya.main;

import com.aarya.engine.GameContainer;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        GameContainer container = new GameContainer();
        container.init();
        container.start();
    }
}
