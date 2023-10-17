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

public class SignUp{

    public static void main() {
        Stage primaryStage = new Stage ();
        primaryStage.setTitle("Coca-Cola® Login");
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 450, 600, Color.LIGHTBLUE);

        GridPane gridpane = new GridPane();
        //gridpane.setGridLinesVisible(true);
        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(50, 150, 300);
        column2.setHgrow(Priority.ALWAYS);
        gridpane.getColumnConstraints().addAll(column1, column2);

        Label fNameLbl = new Label("First Name");
        TextField fNameFld = new TextField();
        Button btnAcc = new Button("Accept name");
        btnAcc.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label lNameLbl = new Label("Last Name");
        TextField lNameFld = new TextField();
        Button btnAcc2 = new Button("Accept name");
        btnAcc2.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label DOB = new Label("Date Of Birth");
        TextField DOBF = new TextField();
        Button btnDOB = new Button("Accept Date Of Birth");
        btnDOB.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label Gender = new Label("Gender");
        TextField GenderF = new TextField();

        Label Email = new Label("Email");
        TextField EmailF = new TextField();
        Button btnEmail = new Button("Accept Email");
        btnEmail.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label Mobile = new Label("Mobile");
        TextField MobileF = new TextField();
        Button btnMobile = new Button("Accept Mobile");
        btnMobile.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label Address = new Label("Address");
        TextField AddressF = new TextField();
        Button btnAddress = new Button("Accept Address");
        btnAddress.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label County = new Label("County");
        TextField CountyF = new TextField();
        Button btnCounty = new Button ("Enter the County");
        btnCounty.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Label Country = new Label("Country");
        TextField CountryF = new TextField();
        Button btnCountry = new Button("Enter the Country");
        btnCountry.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        Button btnMainMenu = new Button("Main Menu");
        btnMainMenu.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        Label Password = new Label("Password");
        TextField PasswordF = new TextField();
        Button btnpassword = new Button ("Please enter a password");
        btnpassword.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");

        Button saveButt = new Button("Create Account");
        saveButt.setStyle("-fx-border-color: #000000; -fx-text-fill: #ffffff; -fx-background-color: #5e5d5e; -fx-border-width: 2px;");
        // First name label
        GridPane.setHalignment(fNameLbl, HPos.RIGHT);
        gridpane.add(fNameLbl, 0, 2);
        gridpane.add(btnAcc, 2, 2);

        // Last name label
        GridPane.setHalignment(lNameLbl, HPos.RIGHT);
        gridpane.add(lNameLbl, 0, 3);
        gridpane.add(btnAcc2, 2, 3);

        GridPane.setHalignment(DOB, HPos.RIGHT);
        gridpane.add(DOB, 0, 4);
        gridpane.add(btnDOB, 2, 4);

        GridPane.setHalignment(Gender, HPos.RIGHT);
        gridpane.add(Gender, 0, 5);

        GridPane.setHalignment(Email, HPos.RIGHT);
        gridpane.add(Email, 0, 6);
        gridpane.add(btnEmail, 2, 6);

        GridPane.setHalignment(Mobile, HPos.RIGHT);
        gridpane.add(Mobile, 0, 7);
        gridpane.add(btnMobile, 2, 7);

        GridPane.setHalignment(Address, HPos.RIGHT);
        gridpane.add(Address, 0, 8);
        gridpane.add(btnAddress, 2, 8);

        GridPane.setHalignment(County, HPos.RIGHT);
        gridpane.add(County, 0, 9);
        gridpane.add(btnCounty, 2, 9);

        GridPane.setHalignment(Country, HPos.RIGHT);
        gridpane.add(Country, 0, 10);
        gridpane.add(btnCountry, 2, 10);

        GridPane.setHalignment(Password, HPos.RIGHT);
        gridpane.add(Password, 0, 11);
        gridpane.add(btnpassword, 2, 11);

        // First name field
        GridPane.setHalignment(fNameFld, HPos.LEFT);
        gridpane.add(fNameFld, 1, 2);

        // Last name field
        GridPane.setHalignment(lNameFld, HPos.LEFT);
        gridpane.add(lNameFld, 1, 3);

        GridPane.setHalignment(DOBF, HPos.LEFT);
        gridpane.add(DOBF, 1, 4);

        GridPane.setHalignment(GenderF, HPos.LEFT);
        gridpane.add(GenderF, 1, 5);

        GridPane.setHalignment(EmailF, HPos.LEFT);
        gridpane.add(EmailF, 1, 6);

        GridPane.setHalignment(MobileF, HPos.LEFT);
        gridpane.add(MobileF, 1, 7);

        GridPane.setHalignment(AddressF, HPos.LEFT);
        gridpane.add(AddressF, 1, 8);

        GridPane.setHalignment(CountyF, HPos.LEFT);
        gridpane.add(CountyF, 1, 9);

        GridPane.setHalignment(CountryF, HPos.LEFT);
        gridpane.add(CountryF, 1, 10);

        GridPane.setHalignment(PasswordF, HPos.LEFT);
        gridpane.add(PasswordF, 1, 11);

        // Save button
        GridPane.setHalignment(saveButt, HPos.CENTER);
        gridpane.add(saveButt, 1, 13);

        GridPane.setHalignment(btnMainMenu, HPos.CENTER);
        gridpane.add(btnMainMenu, 1, 14);

        btnMainMenu.setOnAction(e -> {
            primaryStage.close();
        });

        saveButt.setOnAction(e -> {

            Alert alert = new Alert(AlertType.INFORMATION);// line 1
            alert.setTitle("Information Dialog Box");// line 2
            alert.setHeaderText("Your PIN information");// line 3
            alert.setContentText("Your PIN is set to 1234\nPlease change PIN on first login");// line 4
            alert.showAndWait(); // line 5
            primaryStage.close();
        });


        btnAcc.setOnAction(e -> {
            String text1 = fNameFld.getText();
            String text2 = lNameFld.getText();

            if (valid(text1, text2)) {
                btnAcc.setText("" + text1 + "	 " + text2);
            }
        });


        btnEmail.setOnAction(e -> {
            if (!EmailF.getText().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
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

        btnCountry.setOnAction(e -> {
            if (!CountryF.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);// line 1
                alert.setTitle("Invalid Data");// line 2
                alert.setHeaderText("Country Error");// line 3
                alert.setContentText("You must enter a valid Country");// line 4
                alert.showAndWait(); // line 5
                System.out.println("You must enter a valid Country");
            } else
                System.out.println("Correct Input");

        });

        btnDOB.setOnAction(e -> {
            if (!DOBF.getText().matches("[0-9/]+")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid D.O.B");
                alert.setContentText("You must enter a valid Date Of Birth in the format dd/mm/yy");
                alert.showAndWait();
                System.out.println("You must enter a valid Date Of Birth in the format dd/mm/yy");
            } else
                System.out.println("Correct Input");
        });

        btnMobile.setOnAction(e -> {
            if (!MobileF.getText().matches("[0-9-\\s]+")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid Mobile");
                alert.setContentText("You must enter a valid Phone Number");
                alert.showAndWait();
                System.out.println("You must enter a valid Phone Number");
            } else
                System.out.println("Correct Input");
        });

        btnAddress.setOnAction(e -> {
            if (!AddressF.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid Address");
                alert.setContentText("You must enter a valid Address");
                alert.showAndWait();
                System.out.println("You must enter a valid Address");
            } else
                System.out.println("Correct Input");
        });

        btnCounty.setOnAction(e -> {
            if (!CountyF.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid County");
                alert.setContentText("You must enter a valid County");
                alert.showAndWait();
                System.out.println("You must enter a valid County");
            } else
                System.out.println("Correct Input");
        });

        btnpassword.setOnAction(e -> {
            if (!PasswordF.getText().matches("^[A-Za-z0-9+_.-](.+)$")) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Invalid Data");
                alert.setHeaderText("Invalid County");
                alert.setContentText("You must enter a valid password");
                alert.showAndWait();
                System.out.println("You must enter a valid password");
            } else
                System.out.println("Correct Input");
        });

        // Build top banner area
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
    private static boolean valid(String text1, String text2) { // valid method

        if (!text1.matches("[a-zA-Z\\s']+")) { // upper & lower case a-z, spaces & ' allowed
            System.out.println("You must enter a correct first name");
            return false;

        } else
            System.out.println("Correct Firstname Input");

        if (!text2.matches("[a-zA-Z\\s']+")) { // upper & lower case a-z, spaces & ' allowed
            System.out.println("You must enter a correct surname");
            return false;

        } else
            System.out.println("Correct Surname Input");




        return true;

    }
}
