package com.aarya.components;

import com.aarya.constants.K;
import com.aarya.engine.Component;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.AffineTransform;

public class Player extends Component {

    Sprite layerOne, layerTwo, layerThree;
    final int threshold = 200;

    public Player(Sprite layerOne, Sprite layerTwo, Sprite layerThree, Color colorOne, Color colorTwo) {
        this.layerOne = layerOne;
        this.layerTwo = layerTwo;
        this.layerThree = layerThree;
        colorSprite(layerOne, colorOne);
        colorSprite(layerTwo, colorTwo);
    }

    /* color white pixels to specified col */
    private void colorSprite(Sprite sprite, Color c) {
        for(int y=0; y < sprite.image.getWidth(); y++) {
            for(int x=0; x < sprite.image.getHeight(); x++) {
                Color col = new Color(sprite.image.getRGB(x, y));
                if(col.getRed() > threshold &&
                        col.getGreen() > threshold &&
                        col.getBlue() > threshold) {
                    sprite.image.setRGB(x, y, c.getRGB());
                }
            }
        }
    }

    @Override
    public void render(Graphics2D g) {
        AffineTransform transform = new AffineTransform();
        transform.setToIdentity();
        transform.translate(gameObject.transform.position.x,gameObject.transform.position.y);
        transform.rotate(gameObject.transform.rotation,
                (K.PLAYER_WIDTH * gameObject.transform.scale.x)/2,
                (K.PLAYER_HEIGHT * gameObject.transform.scale.y) /2);
        transform.scale(gameObject.transform.scale.x, gameObject.transform.scale.y);

        g.drawImage(layerOne.image,transform,null);
        g.drawImage(layerTwo.image,transform,null);
        g.drawImage(layerThree.image,transform,null);

    }

    @Override
    public void update(double dt) {

    }

}
