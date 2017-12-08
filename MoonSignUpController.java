import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class MoonSignUpController {

    @FXML
    private Button submitSignup;
    @FXML
    private ToggleGroup fullOrNew;
    @FXML
    private RadioButton selectFullMoon;
    @FXML
    private RadioButton selectNewMoon;

    Stage stage;
    static int isFullUser = 2;//this could be done differently, i know.

    public int fullOrNew(){
        //tell me if the toggle is to zero or 1
        if(this.fullOrNew.getSelectedToggle().equals(selectFullMoon)) {
            isFullUser = 1;
        }
        else{
            isFullUser = 0;
        }
        // if isFullUser = 0; //not a paying customer
        return isFullUser;
    }
    
    public void buttonSignUpSubmit(ActionEvent e) throws IOException {
        //if I want to... send sign up info to a text file/db and check against records (is the user name available?)
        isFullUser = fullOrNew();
        if(isFullUser == 1){
            //Future: send them a form to pay up -> then continue to MoonCentralNode
            MoonCentral(e);
        }
        else{
            //continue to MoonCentralNode
            MoonCentral(e);
        }
    }

    public void MoonCentral (ActionEvent e) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("MoonCentralNode.fxml")); //this creates the buttons via fxml
        Scene scene = new Scene(root, 600, 400);//600/400
        stage = (Stage)((Button)e.getSource()).getScene().getWindow();
        stage.setTitle("Moon");
        stage.setScene(scene);
    }
}
