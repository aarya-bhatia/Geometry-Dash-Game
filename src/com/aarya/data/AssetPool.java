package com.aarya.data;

import com.aarya.components.Sprite;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AssetPool {

    public static Map<String, Sprite> sprites = new HashMap<>();

    public static boolean hasSprite(String fileName) {
        return AssetPool.sprites.containsKey(fileName);
    }

    public static Sprite getSprite(String fileName) {
        File file = new File(fileName);
        if (!AssetPool.hasSprite(fileName)) {
            AssetPool.addSprite(fileName, new Sprite(fileName));
        }
        return AssetPool.sprites.get(file.getAbsolutePath());
    }

    public static void addSprite(String fileName, Sprite sprite) {
        File file = new File(fileName);
        String path = file.getAbsolutePath();
        if(!AssetPool.hasSprite(path)) {
           AssetPool.sprites.put(path, sprite);
        } else {
            System.out.println("Asset pool already has asset: " + path);
            System.exit(-1);
        }
    }
}
