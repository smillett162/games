package games.GameEngine;

import games.model.entities.Stickman;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyboardInputHandler {

    private Stickman player;

    public KeyboardInputHandler(Scene scene, Stickman player) {

        scene.addEventHandler(KeyEvent.KEY_PRESSED, (key) -> {
            if(key.getCode()== KeyCode.RIGHT) {
                player.setRight(true);
            } else if(key.getCode()== KeyCode.LEFT) {
                player.setLeft(true);
            } else if(key.getCode()== KeyCode.UP) {
                player.setUp(true);
            } else if(key.getCode()== KeyCode.DOWN) {
                player.setDown(true);
            }
        });
        scene.addEventHandler(KeyEvent.KEY_RELEASED, (key) -> {
            if(key.getCode()== KeyCode.RIGHT) {
                player.setRight(false);
            } else if(key.getCode()== KeyCode.LEFT) {
                player.setLeft(false);
            } else if(key.getCode()== KeyCode.UP) {
                player.setUp(false);
            } else if(key.getCode()== KeyCode.DOWN) {
                player.setDown(false);
            }
        });

    }
}
