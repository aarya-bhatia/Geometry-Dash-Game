package com.aarya.engine;

import com.aarya.constants.K;
import com.aarya.input.KL;
import com.aarya.input.ML;
import com.aarya.scenes.LevelEditorScene;
import com.aarya.scenes.LevelScene;
import com.aarya.scenes.Scene;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private Image image;
    private Graphics bg;

    public Scene scene;

    public boolean isInEditor = true;

    private static class Helper {
        private static final Window INSTANCE = new Window();
    }

    public void changeScene(int id) {
        switch(id) {
            case 0 -> {
                isInEditor = true;
                this.scene = new LevelEditorScene("Level Editor Scene");
            }
            case 1 -> {
                isInEditor = false;
                this.scene = new LevelScene("Level Scene");
            }
            default -> {
                System.err.println("Scene does not exist!");
                System.exit(-1);
            }
        }
    }

    private Window() {
        setSize(K.SCREEN_WIDTH, K.SCREEN_HEIGHT);
        setTitle(K.TITLE);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addMouseListener(ML.getInstance());
        addMouseMotionListener(ML.getInstance());
        addKeyListener(KL.getInstance());
    }

    public static Window getWindow() {
        return Helper.INSTANCE;
    }

    public void update(double dt) {
        this.scene.update(dt);
    }

    public void render() {
        if(image == null) {
            image = createImage(getWidth(), getHeight());
            bg = image.getGraphics();
        }
        renderOffScreen(bg);
        getGraphics().drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    public void renderOffScreen(Graphics g) {
        scene.render((Graphics2D) g);
    }

}
