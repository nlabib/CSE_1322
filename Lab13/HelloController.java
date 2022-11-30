package com.example.megacalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class HelloController{

	@FXML
	private TextField sum;
	@FXML
	private TextField t1;
	@FXML
	private TextField t2;
	@FXML


	public void handleButtonAction(ActionEvent actionEvent){
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		int sum1 = a + b;
		sum.setText(String.valueOf((sum1)));
	}
	@FXML
	private void handleClearButtonAction(ActionEvent event) {
		t1.clear();
		t2.clear();
		sum.setText("");
	}
}