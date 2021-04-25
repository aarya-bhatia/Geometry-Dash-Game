package com.aarya.engine;

import java.awt.*;

public abstract class Component<T> {

    protected GameObject gameObject;

    public GameObject getGameObject() {
        return gameObject;
    }

    public void setGameObject(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public Component() {
    }

    public void update(double dt) {
    }

    public void render(Graphics2D g) {
    }
}
