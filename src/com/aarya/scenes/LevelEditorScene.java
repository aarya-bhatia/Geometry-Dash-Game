package com.aarya.scenes;

import com.aarya.components.BoxBounds;
import com.aarya.engine.GameObject;
import com.aarya.engine.K;
import com.aarya.engine.Transform;
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
        gameObject.addComponent(new BoxBounds("Box"));
    }

    @Override
    public void update(double dt) {
        BoxBounds b = gameObject.getComponent(BoxBounds.class);
//        System.out.println(b.getName());
        gameObject.update(dt);
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
    }
}
