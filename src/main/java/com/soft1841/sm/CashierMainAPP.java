package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CashierMainAPP extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("超市前台收银系统");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource( "/fxml/cashier.fxml" ));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        primaryStage.setMaximized(true);
        scene.getStylesheets().add(CashierMainAPP.class.getResource("/css/cashier.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
