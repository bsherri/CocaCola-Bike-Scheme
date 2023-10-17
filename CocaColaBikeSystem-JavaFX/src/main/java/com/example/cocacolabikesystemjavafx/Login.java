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

public class Login {
    int count = 0;

    static int[][] myLocNum = new int[3][2];
    static int topup = 0;

    public static void main() {

        int count = 0;
        //String record = " ";

        myLocNum[count][0] = 1234;
        myLocNum[count][1] = 10;
        System.out.println("Pin is" + " " + myLocNum[count][0]);
        System.out.println("Top up " + myLocNum[count][1]);

        count += 1;


        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® com.example.cocacolabikesystemjavafx.Login");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 550, 600, Color.LIGHTGRAY);
        GridPane gridpane = new GridPane();
        //gridpane.setGridLinesVisible(true);
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(100, 75, 150);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        TextField Pin = new TextField();
        Pin.setPromptText("Please enter Pin");
        Button b1 = new Button("Check Pin");
        b1.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(Pin, HPos.RIGHT);
        gridpane.add(Pin, 1, 14);
        gridpane.add(b1, 2, 14);

        TextField nPin = new TextField();
        nPin.setPromptText("Please enter new Pin");
        Button b2 = new Button("Update Pin");
        b2.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(nPin, HPos.RIGHT);
        gridpane.add(nPin, 1, 24);
        gridpane.add(b2, 2, 24);

        TextField TopUp = new TextField();
        TopUp.setPromptText("How Much Would You Like To Top Up By?");
        Button btnTopUp = new Button("Top Up/ Check Balance");
        btnTopUp.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(TopUp, HPos.RIGHT);
        gridpane.add(TopUp, 1, 34);
        gridpane.add(btnTopUp, 2, 34);

        Button reportIssue = new Button ("Report An Issue");
        reportIssue.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; "
                + "-fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(reportIssue, HPos.LEFT);
        gridpane.add(reportIssue, 1, 44);

        Button btnmaintenance = new Button("com.example.cocacolabikesystemjavafx.Maintenance");
        btnmaintenance.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; "
                + "-fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(btnmaintenance, HPos.LEFT);
        gridpane.add(btnmaintenance, 1, 50);

        Button btnTakeBike = new Button("Rent Bike");
        btnTakeBike.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; "
                + "-fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(btnTakeBike, HPos.LEFT);
        gridpane.add(btnTakeBike, 3, 44);

        Button btnreturnBike = new Button("Return Bike");
        btnreturnBike.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; "
                + "-fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(btnreturnBike, HPos.LEFT);
        gridpane.add(btnreturnBike, 3, 50);

        Button MainMenu = new Button ("Back to Main Menu");
        MainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(MainMenu, HPos.LEFT);
        gridpane.add(MainMenu, 2, 53);

        MainMenu.setOnAction(e -> {
            primaryStage.close();
        });

        reportIssue.setOnAction(e -> {
            Reports.main();
        });

        btnmaintenance.setOnAction(e -> {
            MaintenancePassword.main();
        });

        btnreturnBike.setOnAction(e -> {
            ReturnBike.main();
        });

        btnTakeBike.setOnAction(e -> {
            TakeBike.main();
        });

        b1.setOnAction(e -> {

            for (int row = 0; row < myLocNum.length; row++) {
                int Pnum = Integer.parseInt(Pin.getText());
                System.out.println(myLocNum[row][0]);
                System.out.println(Pnum);
                if (Pnum == myLocNum[row][0]) {
                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Account Number");
                    alert.setHeaderText("Account Number");
                    alert.setContentText("You Have Entered The Correct Pin.");
                    alert.showAndWait();
                    System.out.println("You Have Entered The Pin Number " + Pnum);

                    break;
                }
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Account Number");
                alert.setHeaderText("Account Number");
                alert.setContentText("You Have Entered An Incorrect Pin.");
                alert.showAndWait();
                System.out.println("we do not have a match");
            }

        });

        b2.setOnAction(e -> {
            int npin = Integer.parseInt(nPin.getText());
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Updated Pin Number");
            alert.setHeaderText("Updated Pin Number");
            alert.setContentText("You Have Updated Your Pin to " + npin + ".");
            alert.showAndWait();
            System.out.println("You have updated your pin to " + nPin.getText());
            myLocNum[1][0] = npin;


        });

        btnTopUp.setOnAction(e ->{
            int TopUp1 = Integer.parseInt(TopUp.getText());
            System.out.println("You have topped up by " + TopUp1);
            topup = topup + TopUp1;
            System.out.println("Your account balance is " + topup);
            myLocNum[1][1] = TopUp1;
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Account Balance");
            alert.setHeaderText("Account Balance");
            alert.setContentText("You have topped up your account by €" + TopUp1 + ".\nYour new balance is €" + topup + ".");
            alert.showAndWait();
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
