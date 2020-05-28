package hsleiden.stenentijdperk.stenentijdperk;

import hsleiden.stenentijdperk.stenentijdperk.Controllers.LoginController;
import hsleiden.stenentijdperk.stenentijdperk.Views.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
	private Stage primaryStage;
	
    @Override
    public void start(Stage primaryStage) {
        LoginController controller = new LoginController();
        LoginView view = new LoginView(controller);
        
        Scene scene = new Scene(view.setScene(), 800, 800);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Het Stenentijdperk");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
}