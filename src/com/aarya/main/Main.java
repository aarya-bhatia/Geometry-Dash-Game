package com.aarya.main;

import com.aarya.engine.GameContainer;
import com.aarya.engine.GameManager;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        GameContainer container = new GameContainer(new GameManager());
        container.init();
        container.start();
    }
}
