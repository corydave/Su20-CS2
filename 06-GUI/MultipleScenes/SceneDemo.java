import javafx.application.Application;;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SceneDemo extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception {

        window = primaryStage;
        Stage newWindow = new Stage();

        Label label1 = new Label("Welcome to a demo");
        Button button1 = new Button ("Goto next scene");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        Button button2 = new Button ("GO BACK!!!!");
        button2.setOnAction(e -> window.setScene(scene1));

        StackPane layout2 = new StackPane();
//        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(button2);
        scene2 = new Scene(layout2, 600, 200);

        window.setScene(scene1);
        window.setTitle("DEMO");
        window.show();

        newWindow.show();

    }


}
