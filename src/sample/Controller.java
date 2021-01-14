package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.InputMethodEvent;

public class Controller {

    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    int pressButton;
    @FXML
    int counter;
    @FXML
    Label counter1;

    public void initialize(){
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn1.setVisible(false);
        btn2.setVisible(false);
    }


    @FXML
    public void pressButton(ActionEvent event){
        if(counter >= 50) {
            btn1.setVisible(true);
            btn1.setDisable(false);
        }
        if(counter >= 100) {
            btn2.setVisible(true);
            btn2.setDisable(false);
        }

        pressButton = counter++;
        System.out.println("counter " + counter);
        String s=String.valueOf(counter);

        counter1.setText(s);

    }


    @FXML
    public void pressButton1(ActionEvent event){
        if(counter >= 100) {
            btn2.setVisible(true);
            btn2.setDisable(false);
        }
            pressButton = counter += 5;
            System.out.println("counter " + counter);
            String s = String.valueOf(counter);

            counter1.setText(s);
        }

    @FXML
    public void pressButton2(ActionEvent event){
        pressButton = counter += 10;
        System.out.println("counter " + counter);
        String s = String.valueOf(counter);

        counter1.setText(s);
    }

}

//if (event.getSource().equals(pressbutton1){
// int btn1 = integer.parseInt(counter1.getText());
// counter1.setText(String.valueOf());
// }




