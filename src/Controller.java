import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    private Canvas canvas;

    @FXML
    private void onButtonClicked() {
        drawFigures();
    }

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        label.setText("Hello, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        drawFigures();
    }

    private void drawFigures(){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Random rand = new Random();

        Color c = Color.color(rand.nextDouble(), rand.nextDouble(), rand.nextDouble());

        gc.setFill(c);
        gc.fillRect(50, 50, 100, 100);

        gc.setStroke(c);
        gc.strokeOval(200, 100, 150, 150);
    }

}