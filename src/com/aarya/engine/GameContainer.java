package com.aarya.engine;

import com.aarya.util.Time;

public class GameContainer implements Runnable {

    private volatile boolean running = false;
    private final Thread thread;
    private final Window window;

    public GameContainer() {
        window = Window.getWindow();
        thread = new Thread(this);
    }

    public void init() {
        window.changeScene(1);
    }

    public synchronized void start() {
        running = true;
        thread.start();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        double prevTime = 0;
        while(running) {
            try {
                double now = Time.getTime();
                double dt = now - prevTime;
                prevTime = now;
                window.update(dt);
                window.render();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        stop();
    }
}
