package com.aarya.data;

import com.aarya.util.Vector2;

public class Transform {

    public Vector2 position;
    public Vector2 scale;
    public float rotation;

    public Transform(Vector2 position) {
        this.position = position;
        this.scale = new Vector2(1, 1);
        this.rotation = 0.0f;
    }

    public String toString() {
        return String.format("[ Position (%.1f, %.1f) ]", position.x, position.y);
    }
}
