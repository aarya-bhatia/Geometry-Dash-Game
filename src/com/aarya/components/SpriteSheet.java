package com.aarya.components;

import com.aarya.data.AssetPool;

import java.util.ArrayList;
import java.util.List;

public class SpriteSheet {
    public List<Sprite> sprites;
    public int tileWidth, tileHeight;
    public int spacing;

    public SpriteSheet(String pictureFile, int tileWidth, int tileHeight, int spacing, int cols, int size) {
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.spacing = spacing;
        this.sprites = new ArrayList<>();

        Sprite parent = AssetPool.getSprite(pictureFile);

        int row = 0;
        int count = 0;

        while(count < size) {
            for(int column = 0; column < cols; column++) {
                int imgX = (column * tileWidth) + (column * spacing);
                int imgY = (row * tileHeight) + (row * spacing);

                sprites.add(new Sprite(parent.image.getSubimage(imgX, imgY, tileWidth, tileHeight)));
                count++;

                if(count > size - 1) {
                    break;
                }
            }
            row++;
        }
    }
}
