package sample;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class HelpBox {

    public static void display(String title, String message) {
        Stage helpBox = new Stage();

        //Block events to other windows
        helpBox.initModality(Modality.APPLICATION_MODAL);
        helpBox.setTitle("Help");
        helpBox.setMinWidth(250);

        TextArea helpText = new TextArea();
        helpText.setEditable(false);
        helpText.setStyle("-fx-font-weight:bold;");
        helpText.setText("Welcome to the Financial Calculator\n" +
                "\n(1) To access the Savings or Loan Calculator simply press the savings\n button or the loan button and " +
                "input in at least 3 Fields to get a relevant outcome\n" +
                "\n" + "(2) To access the Mortgage or Compound Interest Calculator simply press the mortgage\n " +
                "button or the compound interest button and input in at least 4 Fields to get a relevant outcome");
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> helpBox.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(helpText, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        helpBox.setScene(scene);
        helpBox.showAndWait();
    }

}

