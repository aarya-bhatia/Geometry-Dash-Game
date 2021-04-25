package com.aarya.engine;

import java.awt.*;

public class LevelEditorScene extends Scene {

    private static LevelEditorScene INSTANCE;

    private LevelEditorScene(String name) {
        super(name);
    }

    public static LevelEditorScene getInstance() {
        if(LevelEditorScene.INSTANCE == null) {
            LevelEditorScene.INSTANCE = new LevelEditorScene("Level Editor");
        }
        return LevelEditorScene.INSTANCE;
    }

    @Override
    public void init() {

    }

    @Override
    public void update(double dt) {
    }

    @Override
    public void render(Graphics2D g) {

    }
}
