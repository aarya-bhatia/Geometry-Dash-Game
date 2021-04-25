package com.aarya.engine;

import com.aarya.input.KL;
import com.aarya.input.ML;
import com.aarya.scenes.LevelEditorScene;
import com.aarya.scenes.Scene;

import java.awt.*;

public abstract class AbstractGame {

    protected final ML mouse = ML.getInstance();
    protected final KL keys = KL.getInstance();
    protected Scene scene = LevelEditorScene.getInstance();

    public abstract void update(double dt);
    public abstract void render(Graphics g);

    public void setScene(Scene scene) { this.scene = scene; }
}
