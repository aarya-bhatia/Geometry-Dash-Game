package com.aarya.scenes;

import com.aarya.components.*;
import com.aarya.engine.GameObject;
import com.aarya.constants.K;
import com.aarya.data.Transform;
import com.aarya.util.Vector2;

import java.awt.*;

public class LevelEditorScene extends Scene {

    public GameObject player;

    public LevelEditorScene(String name) {
        super(name);
    }

    @Override
    public void init() {
        player = new GameObject("Test", new Transform(new Vector2(500, 350)));

        SpriteSheet layerOne = new SpriteSheet("assets/player/layerOne.png",
                42, 42, 2, 13, 13 * 5);

        SpriteSheet layerTwo = new SpriteSheet("assets/player/layerTwo.png",
                42, 42, 2, 13, 13 * 5);

        SpriteSheet layerThree = new SpriteSheet("assets/player/layerThree.png",
                42, 42, 2, 13, 13 * 5);

        Player playerComp = new Player(layerOne.sprites.get(0),
                layerTwo.sprites.get(0),
                layerThree.sprites.get(0),
                new Color(124, 19, 19),
                new Color(231, 86, 108));

        player.addComponent(playerComp);

        GameObject ground = new GameObject("Ground",
                new Transform(new Vector2(0, K.GROUND_Y)));

        ground.addComponent(new Ground());

        addGameObject(player);
        addGameObject(ground);
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
