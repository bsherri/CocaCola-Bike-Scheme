package com.example.cocacolabikesystemjavafx;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Faq{

    public static void main() {

        Stage primaryStage = new Stage();
        primaryStage.setTitle("Coca-Cola® FAQ");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 700, 1000, Color.WHITE);
        //scene.setUserAgentStylesheet("-fx-background-color: #ffffff;");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(30, 30, 30, 30));
        grid.setVgap(10);
        grid.setHgap(10);
        ColumnConstraints column1 = new ColumnConstraints(50);
        ColumnConstraints column2 = new ColumnConstraints(25, 75, 150);
        column2.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(column1, column2);

        Button btnMainMenu = new Button("Main Menu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        Text q1 = new Text("What is the Coca-Cola Zero® Bikes service?");
        q1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q1.setFill(Color.RED);
        Text underLine = new Text("____________________________________________________________________________");
        Text a1 = new Text("Coca-Cola Zero® Bikes is a self-service bike rental service open to all from 14-years old. "
                + "\nStations are conveniently located throughout each city making it easy to get around on a Coca-Cola Zero® Bike,"
                + "\nwhether it is commuting to work & meetings or some site-seeing at your leisure. The Coca-Cola Zero® "
                + "\nBike Service consists of stations with a terminal and stands for the Coca-Cola Zero® Bikes."
                + "\nThe Coca-Cola Zero® Bikes are locked into the stands, when a bike is hired it is released by the system. "
                + "\nOn return, the bike is locked back into a stand at any station, and the hire is then completed.");

        Text q2 = new Text("What’s the easiest way of using the Service?");
        q2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q2.setFill(Color.RED);
        Text underLine2 = new Text("_______________________________________________________________________________");
        Text a2 = new Text("A Coca-Cola Zero® Bikes Annual Subscription is the easiest way to use the Coca-Cola Zero® "
                + "\nBike Service in the city - just present your card and enjoy the benefits, all year round, for just €10 year. "
                + "\nThe first 30-minutes of each hire is at no charge, for longer hires a charge applies.");

        Text q3 = new Text("I am just visiting and want to use a Coca-Cola Zero® Bike, "
                + "\nhow do I avail of the service?");
        q3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q3.setFill(Color.RED);
        Text underLine3 = new Text("______________________________________________________________________________________________________");
        Text a3 = new Text("For occasional short-term use or by visitors to the City, there is a convenient 3-Day Subscription option "
                + "\navailable online for just €3. The first 30-minutes of each hire is at no charge, "
                + "\nfor longer hires a charge applies.");

        Text q4 = new Text("How do I get a Coca-Cola Zero® Bikes Annual Subscriber Card?");
        q4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q4.setFill(Color.RED);
        Text underLine4 = new Text("____________________________________________________________________________________________________________");
        Text a4 = new Text("Registration is on-line at www.bikeshare.ie. Please complete the form with your details, "
                + "\nwith the details of a valid Payment Card, which is used for the Annual Subscription of €10, "
                + "\nplus any additional hire charges, and kept securely to cover a €150 guarantee, if a hired bike is not returned with "
                + "\nany 24-hour period or damaged. Create a PIN number, so you can hire a bike at the station with your card. You will "
                + "\nthen receive a Coca-Cola Zero® Bikes Welcome Pack in the post.");

        Text q5 = new Text("I have a 3-day pass, can I keep the bike for 3 days?");
        q5.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        q5.setFill(Color.RED);
        Text underLine5 = new Text("_________________________________________________________________________________________");
        Text a5 = new Text("If you keep the bike for 3 days you will incur significant rental charges. The 3-day pass subscription "
                + "\nallows you the use of a bike to rent over a 3-day period. However the normal rental charges apply. "
                + "\nThe first 30-minutes of each hire is at no charge, for longer hires a charge applies.\n");

        GridPane.setHalignment(btnMainMenu, HPos.CENTER);
        grid.add(btnMainMenu, 7, 25);

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

        GridPane.setHalignment(q4, HPos.LEFT);
        grid.add(q4, 0, 13);

        GridPane.setHalignment(underLine4, HPos.LEFT);
        grid.add(underLine4, 0, 14);

        GridPane.setHalignment(a4, HPos.LEFT);
        grid.add(a4, 0, 15);

        GridPane.setHalignment(q5, HPos.LEFT);
        grid.add(q5, 0, 17);

        GridPane.setHalignment(underLine5, HPos.LEFT);
        grid.add(underLine5, 0, 18);

        GridPane.setHalignment(a5, HPos.LEFT);
        grid.add(a5, 0, 19);

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
