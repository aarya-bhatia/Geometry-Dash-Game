package com.aarya.components;

import com.aarya.constants.K;
import com.aarya.engine.Component;
import com.aarya.engine.GameObject;
import com.aarya.scenes.LevelEditorScene;

import java.awt.*;

public class Ground extends Component {

    @Override
    public void render(Graphics2D g) {
        g.setColor(new Color(148, 52, 4));
        g.fillRect((int) gameObject.transform.position.x - 10,
                (int) gameObject.transform.position.y,
                K.SCREEN_WIDTH + 10, K.SCREEN_HEIGHT);
    }

    @Override
    public void update(double dt) {
        GameObject player = LevelEditorScene.getInstance().player;

        if(player.transform.position.y + player.getComponent(BoxBounds.class).height
        > gameObject.transform.position.y) {
            player.transform.position.y = gameObject.transform.position.y -
                    player.getComponent(BoxBounds.class).height;
        }
    }

}
