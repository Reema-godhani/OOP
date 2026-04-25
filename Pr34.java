import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class RegistrationForm extends Application {

    public void start(Stage stage) {

        Label l1 = new Label("Roll No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Age:");
        Label l4 = new Label("Email:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button btn = new Button("Submit");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);

        gp.add(l1, 0, 0);
        gp.add(t1, 1, 0);

        gp.add(l2, 0, 1);
        gp.add(t2, 1, 1);

        gp.add(l3, 0, 2);
        gp.add(t3, 1, 2);

        gp.add(l4, 0, 3);
        gp.add(t4, 1, 3);

        gp.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int roll = Integer.parseInt(t1.getText());
                String name = t2.getText();
                int age = Integer.parseInt(t3.getText());
                String email = t4.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid Email Format");
                }

                FileChooser fc = new FileChooser();
                fc.setTitle("Save Registration");
                fc.setInitialFileName("student.txt");

                File file = fc.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw =
                            new BufferedWriter(new FileWriter(file));

                    bw.write("Roll No: " + roll);
                    bw.newLine();
                    bw.write("Name: " + name);
                    bw.newLine();
                    bw.write("Age: " + age);
                    bw.newLine();
                    bw.write("Email: " + email);

                    bw.close();
                }

                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Success");
                a.setHeaderText("Registration Successful");
                a.setContentText(
                        "Roll No: " + roll +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                a.showAndWait();

            } catch (NumberFormatException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Error");
                a.setHeaderText("Validation Error");
                a.setContentText("Roll No and Age must be integers.");
                a.showAndWait();

            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Error");
                a.setHeaderText("Validation Error");
                a.setContentText(ex.getMessage());
                a.showAndWait();
            }
        });

        Scene scene = new Scene(gp, 400, 280);

        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
