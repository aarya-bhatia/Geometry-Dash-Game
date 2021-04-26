package com.aarya.engine;

import com.aarya.data.Transform;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GameObject {

    private List<Component> components;
    private String name;
    public Transform transform;

    public GameObject(String name, Transform transform) {
        this.name = name;
        this.transform = transform;
        this.components = new ArrayList<>();
    }

    public void update(double dt) {
        for(Component c: components) {
            c.update(dt);
        }
    }

    public <T extends Component> T getComponent(Class<T> cc) {
        for(Component c: components) {
            if(cc.isAssignableFrom(c.getClass())) {
                try {
                    return cc.cast(c);
                } catch (ClassCastException e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
            }
        }

        return null;
    }

    public void addComponent(Component c) {
        components.add(c);
        c.gameObject = this;
    }

    public void render(Graphics2D g) {
        for(Component c: components) {
            c.render(g);
        }
    }
}
