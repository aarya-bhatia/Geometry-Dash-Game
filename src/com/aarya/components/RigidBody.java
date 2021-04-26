package com.aarya.components;

import com.aarya.constants.K;
import com.aarya.engine.Component;
import com.aarya.util.Vector2;

import java.awt.*;

public class RigidBody extends Component {

    public Vector2 velocity;

    public RigidBody(Vector2 velocity) {
        this.velocity = velocity;
    }

    @Override
    public void update(double dt) {
        gameObject.transform.position.y += velocity.y * dt;
        gameObject.transform.position.x += velocity.x * dt;

        velocity.y += K.GRAVITY * dt;

        if(Math.abs(velocity.y) > K.TERMINAL_VELOCITY) {
            velocity.y = Math.signum(velocity.y) * K.TERMINAL_VELOCITY;
        }
    }

    @Override
    public void render(Graphics2D g) {}

}
