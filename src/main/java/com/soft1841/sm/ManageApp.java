package com.soft1841.sm;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.net.URL;

public class ManageApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle ( "星辰超市管理中心" );
        FXMLLoader fxmlLoader = new FXMLLoader ( getClass ().getResource ( "/fxml/manage.fxml" ) );
        Parent root = fxmlLoader.load ();
        Scene scene = new Scene ( root );
        //界面最大化
        primaryStage.setMaximized ( true );
        scene.getStylesheets ().add ( ManageApp.class.getResource ( "/css/manage.css" ).toExternalForm () );
        //logo设置
        primaryStage.getIcons ().add ( new Image ( "/img/star.png" ) );
        primaryStage.setScene ( scene );
        primaryStage.show ();
    }

    public static void main(String[] args) {
        launch ( args );
    }
}
