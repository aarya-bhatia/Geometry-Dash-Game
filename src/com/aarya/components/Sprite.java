package com.aarya.components;

import com.aarya.data.AssetPool;
import com.aarya.engine.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Sprite extends Component {

    public int width, height;
    public BufferedImage image;

    public Sprite(String fileName) {
        try {
            File file = new File(fileName);
            if(AssetPool.hasSprite(fileName)) {
                throw new Exception("Asset already exists: " + fileName);
            }
            this.image = ImageIO.read(file);
            this.width = image.getWidth();
            this.height = image.getHeight();
        }
        catch (Exception e){
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public Sprite(BufferedImage image) {
        this.image = image;
        this.width = image.getWidth();
        this.height = image.getHeight();
    }

    @Override
    public void render(Graphics2D g) {
        g.drawImage(image,
                (int)gameObject.transform.position.x,
                (int)gameObject.transform.position.y,
                width,
                height,
                null);
//        System.out.println("Rendering sprite ");
    }
}
