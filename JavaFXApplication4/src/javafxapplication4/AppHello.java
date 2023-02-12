package com.mycompany.helloworld;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * JavaFX App
 */
public class AppHello extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        Text hw = new Text("Mostafa Salama");
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        hw.setEffect(r);
        Rectangle r1 = new Rectangle(0,0,300,250);
        r1.setId("r1");
        StackPane root = new StackPane();
        root.getChildren().add(r1);
        root.getChildren().add(hw);
        Scene scene = new Scene(root, 300, 250);
         scene.getStylesheets().clear();
        scene.getStylesheets().add(getClass().getResource("/csspkg/appStyle.css").toExternalForm());
//        stage.setScene(scene);
//        stage.show();
        primaryStage.setTitle("hello world");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}