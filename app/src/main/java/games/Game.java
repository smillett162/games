package games;

import games.GameEngine.KeyboardInputHandler;
import games.model.entities.Stickman;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.*;
import javafx.scene.*;
 
public class Game extends Application {

    private Canvas canvas;
    private GraphicsContext gc;
    private Stickman player;

    public static int CANVAS_HEIGHT = 700;
    public static int CANVAS_WIDTH = 1200;

    public static void startGame()
    {
        launch();
    }

    public void start(Stage theStage)
    {
        theStage.setTitle( "Stickman" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );

        this.canvas = new Canvas( CANVAS_WIDTH, CANVAS_HEIGHT );
        root.getChildren().add( canvas );

        this.gc = canvas.getGraphicsContext2D();

        player = new Stickman();

        final long startNanoTime = System.nanoTime();

        KeyboardInputHandler inputHandler = new KeyboardInputHandler(theScene, player);

        new AnimationTimer()
        {
            public void handle(long currentNanoTime)
            {
                tick();
            }
        }.start();

        theStage.show();
    }

    private void tick() {
        player.tick();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage( player.getImage(), player.getX(), player.getY());
    }
}
