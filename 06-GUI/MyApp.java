// doggo.jpg came from: https://unsplash.com/photos/vT9SSvrAncY

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class MyApp extends Application {

    public static void main (String[] args) {

        System.out.println("TESTING JAVAFX");
        launch (args);

    }

    public void start(Stage primaryStage) {

        primaryStage.setTitle("My Doggo App ");
        GridPane grid = new GridPane();

        grid.setAlignment((Pos.CENTER));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 30));
        grid.add(scenetitle, 0, 0, 2, 1 );

        Label userName = new Label("User name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Image img = new Image("doggo.jpg");
        ImageView imgView = new ImageView(img);
        grid.add(imgView, 0, 3, 2,1);

        HBox buttons = new HBox(20);

        Button btn1 = new Button("Login");
        Button btn2 = new Button("Tip of the day");
        Button btn3 = new Button("Quit");

        buttons.getChildren().add(btn1);
        buttons.getChildren().add(btn2);
        buttons.getChildren().add(btn3);

        grid.add(buttons, 0, 4, 2, 1);

        Label feedback = new Label();
        grid.add(feedback, 0, 5, 2, 1);


        Scene scene = new Scene(grid, 500, 775);
        primaryStage.setScene(scene);
        primaryStage.show();

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("'Login' has been pressed");
                feedback.setText("Incorrect user or password");
                System.out.println(userTextField.getText());
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String message = "'TIP' - Give your doggo pets today.";
                feedback.setText(message);
                System.out.println(message);
            }
        });

        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("'QUIT' has been pressed");
                System.exit(0);
            }
        });


    }

}





















