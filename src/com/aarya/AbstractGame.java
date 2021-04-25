package com.aarya;

import java.awt.*;

public abstract class AbstractGame {

    public abstract void update(GameContainer game, double dt);

    public abstract void render(GameContainer game, Graphics2D g2d);

}
