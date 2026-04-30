import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class GradeBarChart extends Application {

    @Override
    public void start(Stage stage) {

        // Scale factor for height (1% = 3 pixels)
        int scale = 3;

        // Create bars using Rectangle
        Rectangle projectsBar = new Rectangle(50, 20 * scale);
        projectsBar.setFill(Color.RED);

        Rectangle quizzesBar = new Rectangle(50, 10 * scale);
        quizzesBar.setFill(Color.BLUE);

        Rectangle midtermBar = new Rectangle(50, 30 * scale);
        midtermBar.setFill(Color.GREEN);

        Rectangle finalBar = new Rectangle(50, 40 * scale);
        finalBar.setFill(Color.ORANGE);

        // Labels
        Label pLabel = new Label("Projects — 20%");
        Label qLabel = new Label("Quizzes — 10%");
        Label mLabel = new Label("Midterm — 30%");
        Label fLabel = new Label("Final — 40%");

        // VBox for each bar + label
        VBox v1 = new VBox(10, projectsBar, pLabel);
        VBox v2 = new VBox(10, quizzesBar, qLabel);
        VBox v3 = new VBox(10, midtermBar, mLabel);
        VBox v4 = new VBox(10, finalBar, fLabel);

        v1.setAlignment(Pos.BOTTOM_CENTER);
        v2.setAlignment(Pos.BOTTOM_CENTER);
        v3.setAlignment(Pos.BOTTOM_CENTER);
        v4.setAlignment(Pos.BOTTOM_CENTER);

        // HBox to arrange horizontally
        HBox root = new HBox(20, v1, v2, v3, v4);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setStyle("-fx-padding: 20;");

        // Scene
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
