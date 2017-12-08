import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class MoonLoginController {
   @FXML
   public Button loginButton;
   @FXML
   public Button signUpButton;

   //Parent root;
   Stage stage;
    public void handleLoginButton(ActionEvent e) throws Exception {
        /*
        This method should:
        change scene from Login to MoonCentralNode
        Future: take username/password as input
        */

        //do something to get the text in the username/password fields
        Parent root = FXMLLoader.load(getClass().getResource("MoonCentralNode.fxml")); //this creates the buttons via fxml
        Scene scene = new Scene(root, 600, 400);//600/400
        stage = (Stage)((Button)e.getSource()).getScene().getWindow();
        stage.setTitle("Moon");
        stage.setScene(scene);

        //new GuiMain.start1("MoonCentralNode.fxml", "Moon")
        //^^this was my first try on how to open a new stage containing an fxml file
   }
    public void handleSignUpButton(ActionEvent e) throws IOException {
        /*
        This method should:
        change the scene in the stage from Login to SignUp
        */
        //signUpButton.setOnAction(e -> GuiMain.start2("MoonSignup.fxml", "Sign Up"));
        //primaryStage.close(); //don't worry about this yet.
        Parent root; //this creates the buttons via fxml
        root = FXMLLoader.load(getClass().getResource("MoonSignup.fxml"));
        Scene scene = new Scene(root, 500, 500);//signup is 500/500
        stage = (Stage)((Button)e.getSource()).getScene().getWindow();
        stage.setTitle("Sign Up");
        stage.setScene(scene);

         
   }
}
