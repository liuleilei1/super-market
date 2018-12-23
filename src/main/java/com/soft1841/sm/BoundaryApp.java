package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class BoundaryApp extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle ( "星辰超市管理中心" );
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource("/fxml/boundary.fxml"));
        Parent root = fxmlLoader.load ();
        Scene scene = new Scene ( root,1300,950 );
        scene.getStylesheets ().addAll ("/css/login.css");
        primaryStage.getIcons ().add ( new Image ( "/img/star.png" ) );
        primaryStage.setScene ( scene );
        primaryStage.show ();
}
    public static void main(String[] args) {
        launch(args);
    }
}
