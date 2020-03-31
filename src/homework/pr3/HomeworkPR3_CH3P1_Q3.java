/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pr3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author yahya
 */
public class HomeworkPR3_CH3P1_Q3 extends Application {
    Scene scene1,scene2;
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Add Student");
        Button btn2 = new Button("View Student");

        VBox vbox = new VBox(15,btn,btn2);
        vbox.setAlignment(Pos.CENTER);
        Label StuData = new Label("Student Data");
        Label id = new Label("Id");
        Label name = new Label("Name");
        Label major = new Label("Major");
        Label grade = new Label("Grade");
        TextField tID = new TextField();
        TextField tName = new TextField();
        TextField tMajor = new TextField();
        TextField tGrade = new TextField();
        Button add = new Button("Add");
        Button reset = new Button("Reset");
        Button exit = new Button("Exit");
        ListView<String> listView = new ListView<>();

        GridPane gridpane = new GridPane();
        gridpane.add(StuData, 0, 0); 
        gridpane.add(id, 0, 1); 
        gridpane.add(name, 0, 2); 
        gridpane.add(major, 0, 3); 
        gridpane.add(grade, 0, 4); 
        gridpane.add(tID, 1, 1); 
        gridpane.add(tName, 1, 2); 
        gridpane.add(tMajor, 1, 3); 
        gridpane.add(tGrade, 1, 4); 
        HBox hbox = new HBox(10,add,reset,exit);
        VBox vbox2 = new VBox(15,gridpane,hbox);
        HBox hbox2 = new HBox(10,vbox2,listView);

         scene1 = new Scene(vbox, 300, 250);
         scene2 = new Scene(hbox2,500,500);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             primaryStage.setTitle("Student Entry Page");
             primaryStage.setScene(scene2);
             primaryStage.show();   
            }
        });
        add.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
            //Student stu = new Student(tID.getText(),tName.getText(),tMajor.getText(),tGrade.getText());  
            }
        });
        exit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
             primaryStage.setTitle("Options Page");
             primaryStage.setScene(scene1);
             primaryStage.show();   
            }
        });
        primaryStage.setTitle("Options Page");
        primaryStage.setScene(scene1);
        primaryStage.show();
        scene1.getStylesheets().add("style1.css");
        scene2.getStylesheets().add("style1.css");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
