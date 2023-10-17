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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TakeBike {


    public static void main() {


        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® Rent a Bike");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 550, 600, Color.LIGHTBLUE);
        GridPane gridpane = new GridPane();
        //gridpane.setGridLinesVisible(true);
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(100, 75, 150);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        TextField Bikes = new TextField();
        Bikes.setPromptText("How Many Bikes Would You Like To Take?");
        Bikes.getText();
        Button b1 = new Button("Confirm Bike(s)");
        b1.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(Bikes, HPos.RIGHT);
        gridpane.add(Bikes, 1, 14);
        gridpane.add(b1, 2, 14);

        b1.setOnAction(e -> {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Coca-Cola® Bike Scheme");
            alert.setHeaderText("Coca-Cola® Bike Scheme");
            alert.setContentText("You are renting " + Bikes + "bikes from this location. \nThank you for using this service."
                    + "\nPlease be sure to report any damage to bikes.");
            alert.showAndWait();
            primaryStage.close();
        });

        Button MainMenu = new Button ("Back to Main Menu");
        MainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(MainMenu, HPos.LEFT);
        gridpane.add(MainMenu, 1, 24);

        MainMenu.setOnAction(e -> {
            primaryStage.close();
            Login.main();
        });


        Button reportIssue = new Button ("Report An Issue");
        reportIssue.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(reportIssue, HPos.LEFT);
        gridpane.add(reportIssue, 1, 20);

        reportIssue.setOnAction(e -> {
            Reports.main();
        });


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

