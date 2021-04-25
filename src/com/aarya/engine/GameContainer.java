package com.aarya.engine;

import com.aarya.input.KL;
import com.aarya.input.ML;
import com.aarya.util.Time;

public class GameContainer implements Runnable {

    private volatile boolean running = false;
    private final Thread thread;
    private final Window window;
    private final AbstractGame game;

    public GameContainer(AbstractGame game) {
        this.game = game;
        window = Window.getWindow();
        window.addMouseListener(ML.getInstance());
        window.addMouseMotionListener(ML.getInstance());
        window.addKeyListener(KL.getInstance());
        thread = new Thread(this);
    }

    public void init() {
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
                game.update(dt);
                game.render(window.getGraphics());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        stop();
    }
}
