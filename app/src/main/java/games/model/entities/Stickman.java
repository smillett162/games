package games.model.entities;

import javafx.scene.image.Image;

public class Stickman {

    private Image image;
    private int x = 200;
    private int y = 200;

    public Stickman() {
        this.image = new Image( "stickman.png" );
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void moveLeft() {
        x = x - 5;
    }

    public void moveRight() {
        x = x + 5;
    }

    public void moveUp() {
        y = y - 5;
    }

    public void moveDown() {
        y = y + 5;
    }
}
