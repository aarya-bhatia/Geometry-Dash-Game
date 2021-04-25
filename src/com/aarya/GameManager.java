package com.aarya;

import com.aarya.engine.Window;

import java.awt.*;

public class GameManager extends AbstractGame {

    private Image image;
    private Graphics bg;
    private Window window;

    public GameManager() {
        window = Window.getWindow();
    }

    @Override
    public void update(double dt) {
        if(this.scene != null) {
            this.scene.update(dt);
        }
    }

    @Override
    public void render(Graphics g) {
        if(image == null) {
            image = window.createImage(window.getWidth(), window.getHeight());
            bg = image.getGraphics();
        }
        renderOffScreen(bg);
        g.drawImage(image, 0, 0, window.getWidth(), window.getHeight(), null);
    }

    public void renderOffScreen(Graphics g) {
        scene.render((Graphics2D) g);
    }
}
