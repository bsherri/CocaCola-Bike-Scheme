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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ThreeDayPass {

    public static void main() {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® 3 Day Pass");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 450, 550, Color.WHITE);
        scene.setUserAgentStylesheet("");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setVgap(10);
        grid.setHgap(10);
        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Label first = new Label("First Name:");
        TextField firstf = new TextField();
        Button btnAcc = new Button("Validate");
        btnAcc.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label last = new Label("Last Name:");
        TextField lastf = new TextField();
        Button btnAcc2 = new Button("Validate");
        btnAcc2.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label email = new Label("Email:");
        TextField emailf = new TextField();
        Button btnEmail = new Button("Validate");
        btnEmail.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label password = new Label("Password:");
        TextField passwordf = new TextField();
        Button btnPassword = new Button("Validate");
        btnPassword.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label Cred = new Label("Credit Card");
        TextField creditCard = new TextField();
        Button btnCred = new Button("Validate");
        btnCred.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label CVC = new Label("CVC");
        TextField CVCtf = new TextField();
        Button btnCVC = new Button("Validate");
        btnCVC.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label expiry = new Label("Expiry Date");
        TextField expiryTF = new TextField();
        Button btnExpiry = new Button("Validate");
        btnExpiry.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        GridPane.setHalignment(first, HPos.RIGHT);
        grid.add(first, 1, 2);
        GridPane.setHalignment(btnAcc, HPos.RIGHT);
        grid.add(btnAcc, 3, 2);
        GridPane.setHalignment(firstf, HPos.RIGHT);
        grid.add(firstf, 2, 2);

        GridPane.setHalignment(last, HPos.RIGHT);
        grid.add(last, 1, 4);
        grid.add(btnAcc2, 3, 4);
        GridPane.setHalignment(lastf, HPos.RIGHT);
        grid.add(lastf, 2, 4);

        GridPane.setHalignment(email, HPos.RIGHT);
        grid.add(email, 1, 6);
        grid.add(btnEmail, 3, 6);
        GridPane.setHalignment(emailf, HPos.RIGHT);
        grid.add(emailf, 2, 6);

        GridPane.setHalignment(password, HPos.RIGHT);
        grid.add(password, 1, 8);
        grid.add(btnPassword, 3, 8);
        GridPane.setHalignment(passwordf, HPos.RIGHT);
        grid.add(passwordf, 2, 8);

        GridPane.setHalignment(Cred, HPos.RIGHT);
        grid.add(Cred, 1, 10);
        grid.add(btnCred, 3, 10);
        GridPane.setHalignment(creditCard, HPos.RIGHT);
        grid.add(creditCard, 2, 10);

        GridPane.setHalignment(CVC, HPos.RIGHT);
        grid.add(CVC, 1, 12);
        grid.add(btnCVC, 3, 12);
        GridPane.setHalignment(CVCtf, HPos.RIGHT);
        grid.add(CVCtf, 2, 12);

        GridPane.setHalignment(expiry, HPos.RIGHT);
        grid.add(expiry, 1, 14);
        grid.add(btnExpiry, 3, 14);
        GridPane.setHalignment(expiryTF, HPos.RIGHT);
        grid.add(expiryTF, 2, 14);

        Button getBike = new Button("Submit");
        getBike.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        Button btnMainMenu = new Button("MainMenu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        GridPane.setHalignment(getBike, HPos.RIGHT);
        grid.add(getBike, 1, 16);

        GridPane.setHalignment(btnMainMenu, HPos.RIGHT);
        grid.add(btnMainMenu, 2, 16);

        btnMainMenu.setOnAction(e -> {
            primaryStage.close();
        });

        btnAcc.setOnAction(e -> {
            if (!firstf.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Validation Error");// line 3
                alert.setContentText("You must enter a valid Name");// line 4
                alert.showAndWait(); // line 5
            } else
                System.out.println("Correct Input");

        });

        btnAcc2.setOnAction(e -> {
            if (!lastf.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Validation Error");// line 3
                alert.setContentText("You must enter a valid Name");// line 4
                alert.showAndWait(); // line 5
            } else
                System.out.println("Correct Input");

        });

        btnEmail.setOnAction(e -> {
            if (!emailf.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                //	if (!Email.getText().matches("^(.+)@(.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Email Address Error");// line 3
                alert.setContentText("You must enter a valid email address");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter a valid email address");
            } else
                System.out.println("Correct Input");

        });

        btnPassword.setOnAction(e -> {
            if (!passwordf.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                //	if (!Email.getText().matches("^(.+)@(.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Email Address Error");// line 3
                alert.setContentText("You must enter a valid email address");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter a valid email address");
            } else
                System.out.println("Correct Input");

        });

        btnCVC.setOnAction(e -> {
            if (!CVCtf.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Email Address Error");// line 3
                alert.setContentText("You must enter a valid CVC Number");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter a CVC Number");
            } else
                System.out.println("Correct Input");

        });

        btnExpiry.setOnAction(e -> {
            if (!expiryTF.getText().matches("[0-9/]+")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Email Address Error");// line 3
                alert.setContentText("You must enter a valid Expiry Date");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter a valid Expiry Date");
            } else
                System.out.println("Correct Input");

        });

        btnCred.setOnAction(e -> {
            if (creditCard.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Information Dialog Box");// line 2
                alert.setHeaderText("Credit Card Error");// line 3
                alert.setContentText("You must enter valid card details");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter valid card details");
            } else
                System.out.println("Correct Input");

        });

        getBike.setOnAction(e -> {
            TakeBike.main();
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
