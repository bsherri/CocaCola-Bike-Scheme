package com.example.cocacolabikesystemjavafx;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MaintenancePassword {


    public static void main() {


        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® Maintenance Login");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 750, 600, Color.LIGHTBLUE);
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(100, 75, 150);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        Label pword = new Label("Enter Maintenance Password");
        pword.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        TextField password = new TextField();
        password.setPromptText("Enter Password");
        password.getText();
        Button b1 = new Button("Enter Password");
        b1.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnMainMenu = new Button("Main Menu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(pword, HPos.LEFT);
        GridPane.setHalignment(password, HPos.LEFT);
        GridPane.setHalignment(b1, HPos.CENTER);
        GridPane.setHalignment(btnMainMenu, HPos.CENTER);
        gridpane.add(pword, 2, 10);
        gridpane.add(password, 2, 18);
        gridpane.add(b1, 2, 24);
        gridpane.add(btnMainMenu, 2, 26);

        btnMainMenu.setOnAction(e -> {
            primaryStage.close();
        });

        b1.setOnAction(e -> {

            if (!password.getText().matches("2222")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid Data");
                alert.setContentText("You have entered an incorrect password.");
                alert.showAndWait();
                System.out.println("You have entered an incorrect password.");
            } else {
                Maintenance.main();
                System.out.println("Correct Input");
                primaryStage.close();
            }});

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

        Text contactText = new Text("Coca-Cola® Bike Scheme");
        contactText.setFill(Color.RED);

        Text endText = new Text("Coca-Cola®");
        endText.setFill(Color.RED);


        Font serif = Font.font("Proxima Nova", 30);
        contactText.setFont(serif);
        endText.setFont(serif);
        bottomBanner.getChildren().addAll(svgIcon, endText);
        topBanner.getChildren().addAll(svgIcon, contactText);

        root.setTop(topBanner);
        root.setCenter(gridpane);
        root.setBottom(bottomBanner);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}