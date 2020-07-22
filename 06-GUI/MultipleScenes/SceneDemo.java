import javafx.application.Application;;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SceneDemo extends Application {

    static Stage window;
    static Scene scene1, scene2;

    public static void main (String[] args) {
        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception {

        // Create the first stage, 'window', which is the "main program"
        window = primaryStage;

        // Create another stage, 'fighterList', that will show the list of fighters
        Stage fighterList = new Stage();

        // Create elements for the first scene (including event for clicking on button)
        Label labelScene1= new Label("Welcome to a demo on multiple scenes");

        Button buttonGoToScene2 = new Button("Goto scene 2!");
        buttonGoToScene2.setOnAction(e -> window.setScene(scene2));

        // Add elements to a VBox and then to the scene
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(labelScene1, buttonGoToScene2);
        scene1 = new Scene(layout1, 600,200);

        // Create elements for the second scene (including event for clicking on button)
        Label labelScene2 = new Label("This is cool!");

        Button buttonGoToScene1 = new Button("Back to one");
        buttonGoToScene1.setOnAction(e -> {window.setScene(scene1);});

        Button buttonShowFighters = new Button("Show fighters");
        // Example of how to put multiple lines of code to a button click
        buttonShowFighters.setOnAction(e -> {
            fighterList.setX(0);
            fighterList.setY(0);
            fighterList.show();
            System.out.println("Figher window opened.");
        });

        // Add elements to a VBox and then to the scene
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(buttonGoToScene1, labelScene2, buttonShowFighters);
        scene2 = new Scene(layout2, 200, 200);


        // Let's build a new scene that will go in the window!!!!
        Label fighterListLabel = new Label("List of fighters:");

        Button buttonClose = new Button("Close");
        buttonClose.setOnAction(e -> fighterList.close());

        // Add elements to a HBox and then to the scene
        HBox layout3 = new HBox();
        layout3.getChildren().addAll(buttonClose, fighterListLabel);

        // Prep the scene for the 'figherList' window
        Scene fighterScene1 = new Scene(layout3, 300, 300);
        fighterList.setScene(fighterScene1);
        fighterList.setTitle("Fighters");

        // Prep the stage and display 'scene1'
        window.setScene(scene1);
        window.setTitle("DEMO");
        window.setResizable(false);
        window.show();


    }


}
