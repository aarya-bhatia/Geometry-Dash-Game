package com.aarya.scenes;

import com.aarya.components.Player;
import com.aarya.components.SpriteSheet;
import com.aarya.engine.GameObject;
import com.aarya.constants.K;
import com.aarya.data.Transform;
import com.aarya.util.Vector2;

import java.awt.*;

public class LevelEditorScene extends Scene {

    GameObject player;

    private static LevelEditorScene INSTANCE;

    private LevelEditorScene(String name) {
        super(name);
    }

    public static LevelEditorScene getInstance() {
        if (LevelEditorScene.INSTANCE == null) {
            LevelEditorScene.INSTANCE = new LevelEditorScene("Level Editor");
        }
        return LevelEditorScene.INSTANCE;
    }

    @Override
    public void init() {
        player = new GameObject("Test", new Transform(new Vector2(200, 200)));

        SpriteSheet layerOne = new SpriteSheet("assets/player/layerOne.png",
                42, 42, 2, 13, 13 * 5);

        SpriteSheet layerTwo = new SpriteSheet("assets/player/layerTwo.png",
                42, 42, 2, 13, 13 * 5);

        SpriteSheet layerThree = new SpriteSheet("assets/player/layerThree.png",
                42, 42, 2, 13, 13 * 5);

        Player playerComp = new Player(layerOne.sprites.get(0),
                layerTwo.sprites.get(0),
                layerThree.sprites.get(0),
                Color.RED,
                Color.BLUE);

        player.addComponent(playerComp);

        player.transform.rotation = 45;
        player.transform.scale.x = 2;
        player.transform.scale.y = 2;
    }

    @Override
    public void update(double dt) {
        player.update(dt);
        player.transform.rotation += dt * 1;
    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
        player.render(g);
    }
}
