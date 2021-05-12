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

public class Savings {
    private static TextField selectedTextField;
    private static TextField tf1;
    private static TextField tf2;
    private static TextField tf3;
    private static TextField tf4;
    private static TextField textArea;
    private static Label errorLabel;


    public static void display(String title, String message) {

        Stage savings = new Stage();
        savings.setTitle("Savings");
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10,10,10,10));
        grid1.setHgap(8);
        grid1.setVgap(10);
        grid1.setStyle("-fx-background-color:#383838;");

        //The initial principle label and text field
        Label initPrinciple = new Label("Initial Investment");
        tf1 = new TextField();
        Label periods = new Label("Number Of Periods");
        tf2 = new TextField();
        Label interest = new Label("Interest Rate");
        tf3 = new TextField();
        Label futureValue = new Label("Future Value");
        tf4 = new TextField();
        Button calculateBtn = new Button("Calculate");
        errorLabel = new Label();
        errorLabel.setStyle("-fx-background-color: red;-fx-text-fill:white;-fx-font-weight: bold;");
        textArea = new TextField();
        textArea.setEditable(false);
        textArea.setPrefColumnCount(18);
        textArea.setStyle("-fx-text-fill:green;-fx-font-weight: bold;-fx-background-radius: 20");
        initPrinciple.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        periods.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        futureValue.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        interest.setStyle("-fx-text-fill:black;-fx-font-weight: bold;");
        tf1.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf2.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf3.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        tf4.setStyle(" -fx-background-radius: 20;-fx-background-color:#f7bb52");
        installListener(tf1,tf2,tf3,tf4);
        calculateBtn.setOnAction( e -> {
            calculate();
        });
        calculateBtn.setStyle("-fx-text-fill:black;-fx-font-weight: bold;-fx-background-color:#189103");
        GridPane.setConstraints(initPrinciple,0,0);
        GridPane.setConstraints(tf1,1,0);
        GridPane.setConstraints(periods,0,1);
        GridPane.setConstraints(tf2,1,1);
        GridPane.setConstraints(interest,0,2);
        GridPane.setConstraints(tf3,1,2);
        GridPane.setConstraints(futureValue,0,3);
        GridPane.setConstraints(tf4,1,3);
        GridPane.setConstraints(calculateBtn,1,6);
        GridPane.setConstraints(errorLabel,1,8);
        GridPane.setConstraints(textArea,1,9);

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

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) { //Adding  functions to the buttons
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
                selectedTextField.appendText(". ");
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

        grid1.getChildren().addAll(initPrinciple,tf1,periods,tf2,interest,tf3,futureValue,tf4,calculateBtn
                ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,errorLabel,textArea,btn0,btnDel);

        Scene savingsScene = new Scene(grid1,500,400);
        savings.setScene(savingsScene);
        savings.showAndWait();

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
            //getting the inputs from the Text Fields
            if (tf1.getText().equals("")) {
                double years = Double.parseDouble(tf2.getText());
                double rate = Double.parseDouble(tf3.getText());
                double futureValue = Double.parseDouble(tf4.getText());
                double r = rate/ 100.0;
                double n = 12.0 ;
                double principle;
                if((futureValue <= 0 )|| (years <= 0 )|| (rate <= 0 )){
                    resetOutput();
                }
                principle=futureValue/(Math.pow((1+(r/n)),n*years));
                textArea.setText("Principle is :" + currencyFormat.format(principle));
                errorLabel.setText("");
            }
            if (tf2.getText().equals("")) {
                double principle = Double.parseDouble(tf1.getText());
                double rate = Double.parseDouble(tf3.getText());
                double futureValue = Double.parseDouble(tf4.getText());
                double r = rate/ 100.0;
                double n = 12.0 ;
                double years;
                if((futureValue <= 0 )|| (principle <= 0 )|| (rate <= 0 )){
                    resetOutput();
                }

                years= (Math.log(futureValue /principle)) / (n * (Math.log(1 + (r / n))));
                int numYears = (int)years;
                textArea.setText("Number of years are :" +(numYears+1 ));
                errorLabel.setText("");


            }
            if (tf3.getText().equals("")) {
                double principle = Double.parseDouble(tf1.getText());
                double years = Double.parseDouble(tf2.getText());
                double futureValue = Double.parseDouble(tf4.getText());
                double n = 12.0 ;
                double rate;
                double actualRate;
                rate = n * ((Math.pow((futureValue / principle), (1 / (n * years)))) - 1);
                actualRate=Math.round(rate*100);
                textArea.setText("Rate is :" + actualRate);
                errorLabel.setText("");
            }
            if (tf4.getText().equals("")) {
                double principle = Double.parseDouble(tf1.getText());
                double years =  Double.parseDouble(tf2.getText());
                double rate = Double.parseDouble(tf3.getText());
                if((principle <= 0 )|| (years <= 0 )|| (rate <= 0 )){
                    resetOutput();
                }

                double r = rate/ 100.0;
                double n = 12.0 ;
                double futureValue;
                futureValue=principle*(Math.pow((1+(r/n)),(n*years)));
                textArea.setText("Future Value is :" + currencyFormat.format(futureValue));
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
        textArea.setText("");

    }
}












