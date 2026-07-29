package com.educandoweb.javafx2.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ViewController {

    @FXML
    private Button btTest;

    @FXML
    private Label label;

    @FXML
    private void initialize(){
        System.out.println("Tela carregada!");
    }

    @FXML
    private void onBtTestAction(){
        System.out.println("Click");
    }
}
