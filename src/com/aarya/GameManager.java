package com.aarya;

import java.awt.*;
import java.awt.event.KeyEvent;

public class GameManager extends AbstractGame {

    public GameManager() {}

    @Override
    public void update(double dt) {

        if(keys.isPressed(KeyEvent.VK_A)) {
            System.out.println("Key Pressed");
        }
        if(mouse.isPressed()) {
            System.out.println("Mouse pressed");
        }

        if(this.scene != null) {
            this.scene.update(dt);
        }
    }

    @Override
    public void render(Graphics2D g2d) {
    }
}
