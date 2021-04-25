package com.aarya.components;

import com.aarya.engine.Component;

public class BoxBounds extends Component {

    private String name;

    public BoxBounds(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(double dt) {
    }

}
