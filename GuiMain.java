/*
Jackson Frankfurt
CS2: Final GUI
12/6/2017
Windows 10
IDE: Intellij IDEA
Time: 20 Hours
Project: Make a user interface for an application. Specifically, a login and signup screen with something afterwards.
This program consists of 1 main java file, 3 controllers for handling events, 3 fxml files, and a png
which must be in the same directory to work correctly with the fxml.
The app does everything as expected. It even has a picture of a moon.

Over the break, perhaps I'll make a database to deal with user information.
*/


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GuiMain extends Application {

   Stage window;

   public static void main(String[] args){
      launch(args);
   }

   @Override
   public void start(Stage primaryStage) throws Exception {
       window = primaryStage;
       //Parent = base class for all nodes
       Parent root = FXMLLoader.load(getClass().getResource("MoonLogin.fxml"));
       //I'm making a node made of all the elements in the fxml file and putting it in the scene
       window.setScene(new Scene(root, 600, 400));
       //next i put the scene into the window
       window.setTitle("Login");
       window.show();
   }
}



