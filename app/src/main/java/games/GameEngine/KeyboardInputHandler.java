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
                player.moveRight();
            } else if(key.getCode()== KeyCode.LEFT) {
                player.moveLeft();
            } else if(key.getCode()== KeyCode.UP) {
                player.moveUp();
            } else if(key.getCode()== KeyCode.DOWN) {
                player.moveDown();
            }
        });

    }
}
