package com.example.cocacolabikesystemjavafx;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Reports{

    static String response;
    public static void main() {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® Report Page");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 700, 400, Color.WHITE);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setVgap(10);
        grid.setHgap(10);
        ColumnConstraints column1 = new ColumnConstraints(500);
        ColumnConstraints column2 = new ColumnConstraints(250, 750, 1500);
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Text BrokenParts = new Text("Coca-Cola Zero® :"
                + "\n\n\n\nBroken Parts:");
        BrokenParts.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        BrokenParts.setFill(Color.RED);

        Text brokenDown = new Text("If you are having an issue with your bike please replace you bicycle with"
                + "\na new one from any station and let us know what the issue is by filling out the report form below.");
        brokenDown.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 12));
        brokenDown.setFill(Color.BLACK);

        Label labelFirst = new Label("What is your feedback?");

        Button btnSubmit = new Button("Submit");
        btnSubmit.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        Button btnMainMenu = new Button("Main Menu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        TextField text = new TextField();

        btnSubmit.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Dialog Box");
            alert.setHeaderText("Your PIN information");
            response = text.getText();
            alert.setContentText("Your Feedback Is As Follows:\n\n" + text.getText());
            alert.showAndWait();
            primaryStage.close();
        });

        btnMainMenu.setOnAction(e -> {
            primaryStage.close();
        });

        GridPane.setHalignment(brokenDown, HPos.LEFT);
        grid.add(brokenDown, 0, 2);

        GridPane.setHalignment(BrokenParts, HPos.LEFT);
        grid.add(BrokenParts, 0, 2);

        GridPane.setHalignment(labelFirst, HPos.LEFT);
        grid.add(labelFirst, 0, 3);

        GridPane.setHalignment(text, HPos.LEFT);
        grid.add(text, 0, 4);

        GridPane.setHalignment(btnSubmit, HPos.LEFT);
        grid.add(btnSubmit, 0, 5);

        GridPane.setHalignment(btnMainMenu, HPos.LEFT);
        grid.add(btnMainMenu, 0, 6);

        FlowPane topBanner = new FlowPane();
        topBanner.setAlignment(Pos.TOP_LEFT);
        topBanner.setPrefHeight(40);
        String backgroundStyle =
                "-fx-background-color: black;"
                        + "-fx-background-radius: 3px;"
                        + "-fx-background-inset: 5px;";
        topBanner.setStyle(backgroundStyle);

        FlowPane bottomBanner = new FlowPane();
        bottomBanner.setAlignment(Pos.BOTTOM_LEFT);
        bottomBanner.setPrefHeight(20);
        String backgroundStyle2 =
                "-fx-background-color: black;"
                        + "-fx-background-radius: 3px;"
                        + "-fx-background-inset: 5px;";
        bottomBanner.setStyle(backgroundStyle2);

        SVGPath svgIcon = new SVGPath();
        // icon from http://raphaeljs.com/icons/
        svgIcon.setContent("M 19.783 12.079 c -0.164 -0.586 -0.349 -1.206 -0.555 -1.873 A 23.043 23.043 0 0 1 18 5 a 1 1 0 0 1 2 0 a 1 1 0 0 0 2 0 a 3 3 0 0 0 -6 0 a 10.641 10.641 0 0 0 0.319 2.263 L 11.519 11 L 5.971 7 H 9 A 1 1 0 0 0 9 5 H 5.971 A 1.969 1.969 0 0 0 4.809 8.559 L 9.88 12.271 L 8.442 13.39 a 4.954 4.954 0 1 0 1.15 1.638 l 7.289 -5.669 c 0.141 0.476 0.727 2.384 0.856 2.823 a 4.994 4.994 0 1 0 2.046 -0.1 Z M 5 20 a 3 3 0 1 1 3 -3 A 3 3 0 0 1 5 20 Z m 14 0 a 3 3 0 1 1 3 -3 A 3 3 0 0 1 19 20 Z");
        svgIcon.setStroke(Color.LIGHTGRAY);
        svgIcon.setFill(Color.RED);

        Text contactText = new Text(" Coca-Cola® Bike Scheme");
        contactText.setFill(Color.RED);

        Text endText = new Text("Coca-Cola®");
        endText.setFill(Color.RED);


        Font serif = Font.font("Proxima Nova", 30);
        contactText.setFont(serif);
        endText.setFont(serif);
        bottomBanner.getChildren().addAll(svgIcon, endText);
        topBanner.getChildren().addAll(svgIcon, contactText);

        root.setTop(topBanner);
        root.setCenter(grid);
        root.setBottom(bottomBanner);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
