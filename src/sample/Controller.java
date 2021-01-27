package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.TimerTask;
import java.util.Timer;

public class Controller {

    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Label info;
    @FXML
    int pressButton;
    @FXML
    int counter;
    @FXML
    int autoClickerPrice = 20;
    int citronerPrice = 100;
    int aeblerPrice = 250;

    Timer timer;
    @FXML
    Label counter1;

    public void initialize(){
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);


    }
/*
   public void setTimer(){
        timer = new Timer(500, new  ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                counter++;
            }
        });
   }

   public class CookieHandler implements ActionListener{
       @Override
       public void actionPerformed(java.awt.event.ActionEvent e) {

       }
   }

   public void testOnAction(ActionEvent actionEvent){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                        int test = Integer.parseInt(counter1.getText());
                        counter1.setText(String.valueOf(test + 5));
                    }
                });
            }
        },0,500);
   }
*/



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
        if(counter >= 250) {
            btn3.setVisible(true);
            btn3.setDisable(false);
        }

        pressButton = counter++;
        System.out.println("counter " + counter);
        String s=String.valueOf(counter);

        counter1.setText(s);


    }


    @FXML
    public void pressButton1(ActionEvent event){
        if(counter > 49) {
            btn1.setVisible(true);
            btn1.setDisable(false);
        }
        if(counter > 99) {
            btn2.setVisible(true);
            btn2.setDisable(false);
        }
        if(counter > 249) {
            btn3.setVisible(true);
            btn3.setDisable(false);
        }
        if (counter >= autoClickerPrice) {
            //pressButton = counter += 5;
            counter -= autoClickerPrice;
            autoClickerPrice *= 1.5;
            System.out.println("counter " + counter);
            String s = String.valueOf(counter);

            counter1.setText(s);

            /*
            else if (counter <= 4) {

            }
            */

            Timer timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            counter1.setText(String.valueOf(counter += 5));
                        }
                    });
                }
            },0,1000);

        }
    }

    @FXML
    public void pressButton2(ActionEvent event){
        if(counter >= 50) {
            btn1.setVisible(true);
            btn1.setDisable(false);
        }
        if(counter >= 100) {
            btn2.setVisible(true);
            btn2.setDisable(false);
        }
        if(counter >= 250) {
            btn3.setVisible(true);
            btn3.setDisable(false);
        }
        counter -= citronerPrice;
        citronerPrice *= 1.5;
        //pressButton = counter += 10;
        System.out.println("counter " + counter);
        String s = String.valueOf(counter);

        counter1.setText(s);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                        counter1.setText(String.valueOf(counter += 25));
                    }
                });
            }
        },0,1000);
    }

    @FXML
    public void pressButton3(ActionEvent event){
        counter -= aeblerPrice;
        aeblerPrice *= 1.5;
        //pressButton = counter += 25;
        System.out.println("counter " + counter);
        String s = String.valueOf(counter);

        counter1.setText(s);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {

                        counter1.setText(String.valueOf(counter += 50));
                    }
                });
            }
        },0,1000);
    }

    public void Besked(){
        System.out.println("Test");

        info.setText("1 Autoclick coster " + autoClickerPrice);

    }

    public void BeskedE(){

        info.setText("");

    }

    public void Besked1(){
        System.out.println("Test");

        info.setText("1 Citron coster " + citronerPrice);

    }

    public void BeskedE1(){

        info.setText("");

    }

    public void Besked2(){
        System.out.println("Test");

        info.setText("1 Æble coster " + aeblerPrice);

    }

    public void BeskedE2(){

        info.setText("");

    }

}

//if (event.getSource().equals(pressbutton1){
// int btn1 = integer.parseInt(counter1.getText());
// counter1.setText(String.valueOf());
// }




