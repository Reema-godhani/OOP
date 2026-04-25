import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class RandomTextFX extends Application {

    public void start(Stage stage) {
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);

        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            Text txt = new Text("Text " + i);

            txt.setFont(Font.font(
                    "Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22
            ));

            Color c = Color.color(
                    r.nextDouble(),
                    r.nextDouble(),
                    r.nextDouble(),
                    0.3 + (0.7 * r.nextDouble())
            );

            txt.setFill(c);

            root.getChildren().add(txt);
        }

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Five Random Texts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
          }
