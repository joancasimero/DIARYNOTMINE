import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/SignIn.fxml"));
        
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 700, 570));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}