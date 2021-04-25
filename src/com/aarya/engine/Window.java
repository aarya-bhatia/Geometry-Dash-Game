package com.aarya.engine;

import com.aarya.constants.K;

import javax.swing.*;

public class Window extends JFrame {

    private static class Helper {
        private static final Window INSTANCE = new Window();
    }

    private Window() {
        setSize(K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
        setTitle(K.TITLE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static Window getWindow() {
        return Helper.INSTANCE;
    }

}
