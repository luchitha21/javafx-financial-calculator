package sample;

import javafx.application.Application;;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button1,button2,button3,button4,button5;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Financial Calculator");
        primaryStage.show();
        //Button 1
        button1 =new Button("Mortgage");
        button1.setOnAction(e -> Mortgage.display("Mortgage",""));
        button1.setMaxWidth(Double.MAX_VALUE);

        //Button 2
        button2=new Button("Savings");
        button2.setOnAction(e -> Savings.display("Savings",""));
        button2.setMaxWidth(Double.MAX_VALUE);

        //Button 3
        button3=new Button("Loan");
        button3.setOnAction(e -> Loan.show("loan",""));
        button3.setMaxWidth(Double.MAX_VALUE);


        //Button 4
        button4=new Button("Help");
        button4.setOnAction(e ->HelpBox.display("Help","Instructions") );
        button4.setMaxWidth(Double.MAX_VALUE);

        //Button 5
        button5=new Button("Compound Interest");
        button5.setOnAction(e -> CompoundInterest.display("Compound Interest",""));
        button5.setMaxWidth(Double.MAX_VALUE);

        button1.setStyle("-fx-text-fill: black; -fx-background-color:#DFB951; -fx-border-radius: 20;" +
                " -fx-background-radius: 20; -fx-padding: 5;-fx-font-weight: bold;");
        button2.setStyle("-fx-text-fill: black; -fx-background-color: #DFB951; -fx-border-radius: 20;" +
                " -fx-background-radius: 20; -fx-padding: 5;-fx-font-weight: bold;");
        button3.setStyle("-fx-text-fill: black; -fx-background-color: #DFB951; -fx-border-radius: 20;" +
                " -fx-background-radius: 20; -fx-padding: 5;-fx-font-weight: bold;");
        button4.setStyle("-fx-text-fill: black; -fx-background-color: #DFB951; -fx-border-radius: 20; " +
                "-fx-background-radius: 20; -fx-padding: 5;-fx-font-weight: bold;");
        button5.setStyle("-fx-text-fill: black; -fx-background-color: #DFB951; -fx-border-radius: 20; " +
                "-fx-background-radius: 20; -fx-padding: 5;-fx-font-weight: bold;");

        //Primary layout
        TilePane layout1 = new TilePane(Orientation.VERTICAL);
        layout1.getChildren().addAll(button2,button1,button3,button5,button4);
        layout1.setPadding(new Insets(5, 0, 0, 120));
        layout1.setVgap(30);
        layout1.setStyle("-fx-background-color: #262626;");
        Scene scene1 = new Scene(layout1,350,350);
        primaryStage.setScene(scene1);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
