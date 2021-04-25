package com.aarya.engine;

import java.awt.*;

public abstract class AbstractGame {

    protected final ML mouse = ML.getInstance();
    protected final KL keys = KL.getInstance();
    protected Scene scene = LevelEditorScene.getInstance();

    public abstract void update(double dt);
    public abstract void render(Graphics g);

    public void setScene(Scene scene) { this.scene = scene; }
}
