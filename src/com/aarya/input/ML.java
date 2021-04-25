package com.aarya.input;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Mouse Listener
 */
public class ML extends MouseAdapter {

    private static ML INSTANCE;
    private boolean pressed = false;
    private boolean dragged = false;
    private float x = -1, y = -1;
    private float dx = -1, dy = -1;
    private int button = -1;

    private ML(){}

    public static synchronized ML getInstance() {
        if(ML.INSTANCE == null) {
            ML.INSTANCE = new ML();
        }
        return ML.INSTANCE;
    }

    public boolean isPressed() {
        return pressed;
    }

    public boolean isDragged() {
        return dragged;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getDx() {
        return dx;
    }

    public float getDy() {
        return dy;
    }

    public int getButton() {
        return button;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        pressed = true;
        button = e.getButton();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        pressed = false;
        dragged = false;
        dx = 0;
        dy = 0;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        dragged = true;
        dx = e.getX() - x;
        dy = e.getY() - y;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}
