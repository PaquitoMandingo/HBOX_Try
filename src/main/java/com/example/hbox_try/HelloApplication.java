package com.example.hbox_try;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


        /*VBox escenaP =new VBox();
        TextField caja1=new TextField();
        Label textoNombre=new Label("Nombre");
        TextField caja2=new TextField();
        Label textoApellido=new Label("Apellido");

        HBox linea1 =new HBox(textoNombre,caja1);
        HBox linea2 =new HBox(textoApellido,caja2);

        Button btn1=new Button();
        btn1.setText("BTN-1");
        Button btn2=new Button();
        btn2.setText("BTN-2");

        escenaP.getChildren().addAll(linea1);*/

        HBox hbox = new HBox();
        TextField field = new TextField();
        hbox.getChildren().addAll(new Label("Texto ejemplo:"), new Button("1"),new Button("2"),new Button("3"));

        HBox escenaP =new HBox();

        Scene scene = new Scene(escenaP, 600, 400);
        stage.setScene(scene);
        stage.show();

        escenaP.getChildren().addAll(hbox);





    }

    public static void main(String[] args) {
        launch();
    }
}