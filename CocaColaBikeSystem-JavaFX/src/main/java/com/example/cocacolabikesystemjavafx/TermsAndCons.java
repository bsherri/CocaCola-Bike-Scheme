package com.example.cocacolabikesystemjavafx;

import javafx.scene.control.Button;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TermsAndCons{


    public static void main() {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® Terms and Conditions");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 850, 1000, Color.WHITE);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setVgap(10);
        grid.setHgap(10);
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(25, 75, 150);
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Text q1 = new Text("What is the Coca-Cola Zero® Bikes service?");
        q1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q1.setFill(Color.RED);
        Text underLine = new Text("____________________________________________________________________________");
        Text a1 = new Text("1. Introduction\r\n"
                + "The National Transport Authority is providing a service (the \"Service\") enabling access to self-service hire "
                + "\nbicycles in the cities of Galway, Limerick and Cork under public bike share schemes operated as Coca-Cola Zero® Bikes.\r\n"
                + "\r\n"
                + "The Service is operated on behalf of the National Transport Authority by Telfourth Limited, trading as An Rothar Nua.\r\n"
                + "\r\n"
                + "These terms and conditions set out the agreement between you and the National Transport Authority "
                + "\nin relation to the opening and operation of an account with the National Transport Authority for the use of the Coca-Cola Zero® Bikes.\r\n"
                + "\r\n"
                + "Coca-Cola Zero is a registered trademark of the Coca-Cola Company.\r\n"
                + "\r\n"
                + "The Authority would draw your attention to the fact that amounts are payable by you "
                + "\nin connection with this Agreement.");

        Text q2 = new Text("Opening an Account");
        q2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q2.setFill(Color.RED);
        Text underLine2 = new Text("_______________________________________________________________________________");
        Text a2 = new Text("(1) To open an Account, you must complete an Account Application Form through the Website.\r\n"
                + "\r\n"
                + "(2) The information to be provided as part of the Account Application Form includes:\r\n"
                + "\r\n"
                + "          (2.a) Name, address, contact details;\r\n"
                + "\r\n"
                + "          (2.b) Payment card details; and\r\n"
                + "\r\n"
                + "          (2.c) E-mail address.\r\n"
                + "\r\n"
                + "(3) The Authority reserves the right:\r\n"
                + "\r\n"
                + "          (3.a) To refuse any application to open an Account; and/or\r\n"
                + "\r\n"
                + "          (3.b) To refuse to enter into this Agreement.");

        Text q3 = new Text("Acceptance of this Agreement");
        q3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q3.setFill(Color.RED);
        Text underLine3 = new Text("_______________________________________________________________________________");
        Text a3 = new Text("(1) Before this Agreement takes effect and an Account is opened by the Authority, "
                + "\n     you will be asked, as part of the completion of the Account Application Form, "
                + "\n     to read these terms and conditions and then click the \"Accept\" button, if you wish to proceed.\r\n"
                + "\r\n"
                + "(2) By clicking the \"Accept\" button, you will have, and be deemed to have, "
                + "\n     entered into and accepted this Agreement.");

        Button btnMainMenu = new Button("Main Menu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        GridPane.setHalignment(q1, HPos.LEFT);
        grid.add(q1, 0, 1);

        GridPane.setHalignment(underLine, HPos.LEFT);
        grid.add(underLine, 0, 2);

        GridPane.setHalignment(a1, HPos.LEFT);
        grid.add(a1, 0, 3);

        GridPane.setHalignment(q2, HPos.LEFT);
        grid.add(q2, 0, 5);

        GridPane.setHalignment(underLine2, HPos.LEFT);
        grid.add(underLine2, 0, 6);

        GridPane.setHalignment(a2, HPos.LEFT);
        grid.add(a2, 0, 7);

        GridPane.setHalignment(q3, HPos.LEFT);
        grid.add(q3, 0, 9);

        GridPane.setHalignment(underLine3, HPos.LEFT);
        grid.add(underLine3, 0, 10);

        GridPane.setHalignment(a3, HPos.LEFT);
        grid.add(a3, 0, 11);

        GridPane.setHalignment(btnMainMenu, HPos.LEFT);
        grid.add(btnMainMenu, 7, 15);

        btnMainMenu.setOnAction(e -> {
            primaryStage.close();
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
