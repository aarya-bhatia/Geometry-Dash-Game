package com.aarya.engine;

import com.aarya.components.BoxBounds;
import com.aarya.util.Vector2;

import java.awt.*;

public class LevelEditorScene extends Scene {

    GameObject gameObject;

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
        gameObject = new GameObject("Test", new Transform(new Vector2(0, 0)));
        gameObject.addComponent(new BoxBounds());
    }

    @Override
    public void update(double dt) {
        gameObject.update(dt);
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
    }
}
