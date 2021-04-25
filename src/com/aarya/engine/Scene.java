package com.aarya.engine;

import java.awt.*;

public abstract class Scene {

    protected String name;

    public Scene(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("[ %s ]", name);
    }

    public abstract void init();

    public abstract void update(double dt);

    public abstract void render(Graphics2D g);
}
