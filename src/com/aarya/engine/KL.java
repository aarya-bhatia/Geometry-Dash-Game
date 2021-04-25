package com.aarya.engine;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Key Listener
 */
public class KL extends KeyAdapter implements KeyListener {

    private static KL INSTANCE;
    private boolean keys[];

    private KL() {
        keys = new boolean[128];
    }

    public static synchronized KL getInstance() {
        if(KL.INSTANCE == null) { KL.INSTANCE = new KL(); }
        return KL.INSTANCE;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() >= keys.length) { return; }
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() >= keys.length) { return; }
        keys[e.getKeyCode()] = false;
    }

    public boolean isPressed(int keyCode) {
        if(keyCode < 0 || keyCode >= keys.length) { return false; }
        return keys[keyCode];
    }
}
