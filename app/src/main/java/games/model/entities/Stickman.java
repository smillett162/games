package games.model.entities;

import games.Game;
import javafx.scene.image.Image;

public class Stickman {

    private Image image;
    private int x = 200;
    private int y = 200;

    private int imageX = 50;
    private int imageY = 50;

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
        if (x - 5 >= 0) {
            x = x - 5;
        } else {
            x = 0;
        }
    }

    public void moveRight() {
        if (x + 5 <= Game.CANVAS_WIDTH - imageX) {
            x = x + 5;
        } else {
            x = Game.CANVAS_WIDTH - imageX;
        }
    }

    public void moveUp() {
        if (y - 5 >= 0) {
            y = y - 5;
        } else {
            y = 0;
        }
    }

    public void moveDown() {
        if (y + 5 <= Game.CANVAS_HEIGHT - imageY) {
            y = y + 5;
        } else {
            y = Game.CANVAS_HEIGHT - imageY;
        }
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
