package games.model.entities;

import javafx.scene.image.Image;

public class Stickman {

    private Image image;
    private int x = 200;
    private int y = 200;

    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

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

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void tick(){
        if (right) {
            moveRight();
        }
        if (left) {
            moveLeft();
        }
        if (down) {
            moveDown();
        }
        if (up) {
            moveUp();
        }
    }
}
