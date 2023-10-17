package com.example.cocacolabikesystemjavafx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

public class Homepage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Coca-Cola® Bike Scheme");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 550, 650, Color.DARKGRAY);
        //scene.setUserAgentStylesheet("-fx-background-color: #FFFFFF;");


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setVgap(10);
        grid.setHgap(10);
        ColumnConstraints column1 = new ColumnConstraints();
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Button btnLogin = new Button("     Login     ");
        btnLogin.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnSignIn = new Button("    Sign-Up   ");
        btnSignIn.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnthreeDay = new Button("Three - Day Pass");
        btnthreeDay.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnfaq = new Button("      FAQ      ");
        btnfaq.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btntandc = new Button("      T&C      ");
        btntandc.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnReport = new Button("Report an Issue");
        btnReport.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnMaintenance = new Button("Maintenance Login");
        btnMaintenance.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnExit = new Button ("     Exit     ");
        btnExit.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        btnExit.setOnAction(e -> {
            javafx.application.Platform.exit();
        });

        btnMaintenance.setOnAction(e -> {
            MaintenancePassword.main();
        });

        btnfaq.setOnAction(e -> {
            Faq.main();
        });

        btnLogin.setOnAction(e -> {
            Login.main();
        });

        btnSignIn.setOnAction(e -> {

            SignUp.main();
        });

        btntandc.setOnAction(e -> {
            TermsAndCons.main();
        });

        btnthreeDay.setOnAction(e -> {
            ThreeDayPass.main();
        });

        btnReport.setOnAction(e -> {
            Reports.main();
        });

        GridPane.setHalignment(btnLogin, HPos.CENTER);
        grid.add(btnLogin, 1, 6);

        GridPane.setHalignment(btnSignIn, HPos.CENTER);
        grid.add(btnSignIn, 1, 12);

        GridPane.setHalignment(btnthreeDay, HPos.CENTER);
        grid.add(btnthreeDay, 1, 18);

        GridPane.setHalignment(btnfaq, HPos.CENTER);
        grid.add(btnfaq, 0, 24);

        GridPane.setHalignment(btntandc, HPos.CENTER);
        grid.add(btntandc, 3, 24);

        GridPane.setHalignment(btnReport, HPos.CENTER);
        grid.add(btnReport, 0, 26);

        GridPane.setHalignment(btnExit, HPos.CENTER);
        grid.add(btnExit, 0, 32);

        GridPane.setHalignment(btnMaintenance, HPos.CENTER);
        grid.add(btnMaintenance, 3, 26);

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
