package com.example.calculator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;
import java.util.regex.Pattern;

public class HelloController {

    @FXML
    private Button act_div;

    @FXML
    private Button act_minus;

    @FXML
    private Button act_multiply;

    @FXML
    private Button act_plus;

    @FXML
    private TextField txt_a;

    @FXML
    private TextField txt_b;

    @FXML
    private TextField wtt;
    @FXML
    private TextField txt_result;

    @FXML
    void action_select(ActionEvent event) {
          String a;
          String b;
          int z;

        a= txt_a.getText();
        b=txt_b.getText();
        if (Pattern.matches("a-zA-z",a) & Pattern.matches("a-zA-Z",b)){
            wtt.setText("введите число ");

        }
        else{

            int c = Integer.parseInt(txt_a.getText());
            int v = Integer.parseInt(txt_b.getText());
            z = c + v;
            wtt.setText(""+z);
        }
    }


    @FXML
    void ext_click(ActionEvent event) {
        System.exit(1);
    }

}
