package com.aarya.scenes;

import com.aarya.engine.Camera;
import com.aarya.engine.GameObject;
import com.aarya.engine.Renderer;
import com.aarya.util.Vector2;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    String name;
    public Camera camera;
    List<GameObject> gameObjects;
    Renderer renderer;

    public Scene(String name) {
        this.name = name;
        this.camera = new Camera(new Vector2());
        this.gameObjects = new ArrayList<>();
        this.renderer = new Renderer(camera);
        init();
    }

    public String toString() {
        return String.format("[ %s ]", name);
    }

    public abstract void init();

    public abstract void update(double dt);

    public abstract void render(Graphics2D g);
}
