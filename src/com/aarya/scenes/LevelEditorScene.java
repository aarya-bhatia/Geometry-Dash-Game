package com.aarya.scenes;

import com.aarya.components.*;
import com.aarya.engine.GameObject;
import com.aarya.constants.K;
import com.aarya.data.Transform;
import com.aarya.util.Vector2;

import java.awt.*;

public class LevelEditorScene extends Scene {

    public GameObject player;
    public GameObject ground;

    public LevelEditorScene(String name) {
        super(name);
    }

    @Override
    public void init() {
    }

    @Override
    public void update(double dt) {
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(248, 225, 225));
        g.fillRect(0, 0, K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
        renderer.render(g);
    }
}
