package com.aarya.components;

import com.aarya.constants.K;
import com.aarya.engine.Component;
import com.aarya.engine.GameObject;
import com.aarya.engine.Window;
import com.aarya.scenes.LevelScene;

import java.awt.*;

public class Ground extends Component {

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(148, 52, 4));
        g.fillRect((int) gameObject.transform.position.x,
                (int) gameObject.transform.position.y,
                K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
    }

    @Override
    public void update(double dt) {
        LevelScene scene = (LevelScene) Window.getWindow().scene;
        GameObject player = scene.player;

        if(player.transform.position.y + player.transform.scale.y *
                player.getComponent(BoxBounds.class).height
        > gameObject.transform.position.y) {
            player.transform.position.y = gameObject.transform.position.y -
                 player.transform.scale.y * player.getComponent(BoxBounds.class).height;
        }

        gameObject.transform.position.x = scene.camera.position.x;
    }

}
