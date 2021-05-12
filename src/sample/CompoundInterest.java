package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.text.NumberFormat;

public class CompoundInterest {
    private static TextField selectedTextField;
    private static TextField tf1;
    private static TextField tf2;
    private static TextField tf3;
    private static TextField tf4;
    private static TextField tf5;
    private static TextField textArea;
    private static Label errorLabel;

    public static void display(String title, String message) {

        Stage compoundInt = new Stage();
        compoundInt.setTitle("Compound Interest");
        GridPane grid4 = new GridPane();
        grid4.setPadding(new Insets(10, 10, 10, 10));
        grid4.setHgap(8);
        grid4.setVgap(10);
        grid4.setStyle("-fx-background-color:#383838;");

        //The initial principle label and text field
        Label presentVal = new Label("Present Value");
        tf1 = new TextField();
        Label time = new Label("Time in years");
        tf2 = new TextField();
        Label intRate = new Label("Interest Rate");
        tf3 = new TextField();
        Label monthlyPyt = new Label("Monthly Payment");
        tf4 = new TextField();
        Label futureVal = new Label("Future Value");
        tf5 = new TextField();
        Button calculateBtn = new Button("Calculate");
        errorLabel = new Label();
        errorLabel.setStyle("-fx-background-color: red;-fx-text-fill:white;-fx-font-weight: bold;");
        textArea = new TextField();
        textArea.setEditable(false);
        textArea.setPrefColumnCount(18);
        textArea.setStyle("-fx-text-fill:green;-fx-font-weight: bold;-fx-background-radius: 20");
        presentVal.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        time.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        intRate.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        monthlyPyt.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        futureVal.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        tf1.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf2.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf3.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf4.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf5.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        installListener(tf1, tf2, tf3, tf4,tf5);

        calculateBtn.setStyle("-fx-text-fill:black;-fx-font-weight: bold;-fx-background-color:#189103");
        GridPane.setConstraints(presentVal, 0, 0);
        GridPane.setConstraints(tf1, 1, 0);
        GridPane.setConstraints(time, 0, 1);
        GridPane.setConstraints(tf2, 1, 1);
        GridPane.setConstraints(intRate, 0, 2);
        GridPane.setConstraints(tf3, 1, 2);
        GridPane.setConstraints(monthlyPyt, 0, 3);
        GridPane.setConstraints(tf4, 1, 3);
        GridPane.setConstraints(futureVal, 0, 4);
        GridPane.setConstraints(tf5, 1, 4);
        GridPane.setConstraints(calculateBtn, 1, 6);
        GridPane.setConstraints(errorLabel, 1, 8);
        GridPane.setConstraints(textArea, 1, 9);

        //The number keyboard
        Button btn1 = new Button("1");
        btn1.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn1,2,1);
        Button btn2 = new Button("2");
        btn2.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn2,3,1);
        Button btn3 = new Button("3");
        btn3.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn3,4,1);
        Button btn4 = new Button("4");
        btn4.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn4,5,1);
        Button btn5 = new Button("5");
        btn5.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn5,2,2);
        Button btn6 = new Button("6");
        btn6.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn6,3,2);
        Button btn7 = new Button("7");
        btn7.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn7,4,2);
        Button btn8 = new Button("8");
        btn8.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn8,5,2);
        Button btn9 = new Button("9");
        btn9.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn9,3,3);
        Button btn10 = new Button(".");
        btn10.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn10,4,3);
        Button btn0 = new Button("0");
        btn0.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btn0,2,3);
        Button btnDel = new Button("D");
        btnDel.setStyle(" -fx-background-radius: 100;");
        GridPane.setConstraints(btnDel,5,3);

        calculateBtn.setOnAction( e -> {
            calculate();
        });

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("1");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("2");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("3");
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("4");
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("5");
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("6");
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("7");
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("8");
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("9");
            }
        });
        btn10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText(".");
            }
        });
        btn0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                selectedTextField.appendText("0");
            }
        });
        btnDel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    selectedTextField.setText(selectedTextField.getText().substring(0, selectedTextField.getLength() - 1));
                } catch (StringIndexOutOfBoundsException ignored){}

            }
        });

        grid4.getChildren().addAll(presentVal,tf1,time,tf2,futureVal,tf3,intRate,tf4,calculateBtn
                ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,errorLabel,textArea,tf5,monthlyPyt,btn0,btnDel);

        Scene savingsScene = new Scene(grid4,500,400);
        compoundInt.setScene(savingsScene);
        compoundInt.show();

    }

    // Accepts multiple TextFields
    private static void installListener(TextField... textFields) {

        // Install the same listener on all of them
        for (TextField textField : textFields) {
            textField.focusedProperty().addListener((observableValue, oldValue, newValue) -> {

                if (newValue) {
                    // The new text field is focused, so set the global reference
                    selectedTextField = textField;


                }
            });
        }

    }
    private static void calculate() {
        NumberFormat currencyFormat =
                NumberFormat.getCurrencyInstance();
        try {

            if (tf1.getText().equals("")) {
                double time = Double.parseDouble(tf2.getText());
                double intRate = Double.parseDouble(tf3.getText());
                double monthlyPyt = Double.parseDouble(tf4.getText());
                double futureVal = Double.parseDouble(tf5.getText());
                double r = (intRate/12)/ 100.0;
                double n = 12;
                double presentVal;
                if((time <= 0 )|| (intRate <= 0 )|| (monthlyPyt <= 0 )|| (futureVal <= 0 )){
                    resetOutput();
                }
                presentVal = (futureVal - (monthlyPyt * ((Math.pow((1 + (r/n)), n * time) - 1) / (r/n))))/ (Math.pow((1 + (r/n)), n * time));
                textArea.setText("present Value Is :"+ currencyFormat.format(presentVal));
                errorLabel.setText("");
            }
            if (tf2.getText().equals("")) {
                double presentVal = Double.parseDouble(tf1.getText());
                double intRate = Double.parseDouble(tf3.getText());
                double monthlyPyt = Double.parseDouble(tf4.getText());
                double futureVal= Double.parseDouble(tf5.getText());

                double r = (intRate/12)/ 100.0;
                double n = 12;
                double time;
                if((presentVal <= 0 )|| (intRate <= 0 )|| (monthlyPyt <= 0 )|| (futureVal <= 0 )) {
                    resetOutput();
                }
                time = Math.log(((((r * futureVal) / n) + monthlyPyt) / (((presentVal * r) / n) + monthlyPyt))) / (n * Math.log(1 + (r/n)));
                int timeYears = (int)time;
                textArea.setText("Time in Years is :"+timeYears);
                errorLabel.setText("");
            }
            if (tf3.getText().equals("")) {
                resetOutput();
                }

            if (tf4.getText().equals("")) {
                double presentVal = Double.parseDouble(tf1.getText());
                double time = Double.parseDouble(tf2.getText());
                double intRate = Double.parseDouble(tf3.getText());
                double futureVal= Double.parseDouble(tf5.getText());
                double r = (intRate/12)/ 100.0;
                double n = 12;
                double monthlyPyt;
                if((presentVal <= 0 )|| (intRate <= 0 )|| (time <= 0 )|| (futureVal <= 0 )){
                    resetOutput();
                }
                monthlyPyt = (futureVal - (presentVal * Math.pow((1 + (r / n)), (n * time)))) / ((Math.pow((1 + (r / n)), (n * time)) - 1) / (r / n));
                textArea.setText("Monthly Payment is :"+ currencyFormat.format(monthlyPyt));
                errorLabel.setText("");
            }

            if (tf5.getText().equals("")) {
                double presentVal = Double.parseDouble(tf1.getText());
                double time = Double.parseDouble(tf2.getText());
                double intRate = Double.parseDouble(tf3.getText());
                double monthlyPyt= Double.parseDouble(tf4.getText());

                double r = (intRate/12)/ 100.0;
                double n = 12;
                double futureVal;
                if((presentVal <= 0 )|| (intRate <= 0 )|| (time <= 0 )|| (monthlyPyt <= 0 )){
                    resetOutput();
                }
                futureVal = (presentVal * Math.pow((1 + (r / n)), (n * time))) + (monthlyPyt * ((Math.pow((1 + (r / n)), (n * time)) - 1) / (r/n)));
                textArea.setText("Future Value is :"+ currencyFormat.format(futureVal));
                errorLabel.setText("");
            }
        }
        catch (NumberFormatException e){
            resetOutput();
        }

    }

    private static void resetOutput(){
        errorLabel.setText("Invalid Input!");
        tf1.setText("");//to clear out previous content.
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        textArea.setText("");

    }

}