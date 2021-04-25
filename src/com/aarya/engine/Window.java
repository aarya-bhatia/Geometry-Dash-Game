package com.aarya.engine;

import com.aarya.K;
import com.aarya.util.Time;

import javax.swing.*;

public class Window extends JFrame implements Runnable {

    private volatile boolean running = false;

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

    public void init() {

    }

    public static Window getWindow() {
        return Helper.INSTANCE;
    }

    public synchronized void start() {
        running = true;
    }

    public synchronized void stop() {
        running = false;
    }

    @Override
    public void run() {
        double lastFrameTime = 0;

        while(running) {
            try {
                double time = Time.getTime();
                double deltaTime = time - lastFrameTime;

                lastFrameTime = time;

                update(deltaTime);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void update(double dt) {
        System.out.println(dt);
    }
}
