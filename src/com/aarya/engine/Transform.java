package com.aarya.engine;

import com.aarya.util.Vector2;

public class Transform {

    Vector2 position;
    Vector2 scale;
    Vector2 rotation;

    public Transform(Vector2 position) {
        this.position = position;
    }

    public String toString() {
        return String.format("[ Position (%.1f, %.1f) ]", position.getX(), position.getY());
    }
}
