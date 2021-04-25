package com.aarya;

import com.aarya.engine.Window;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        Window window = Window.getWindow();
        window.init();

        Thread t = new Thread(window);
        t.start();
    }
}
