package com.jaba.videopaley;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader MasterPane = new FXMLLoader(getClass().getResource("MasterPane.fxml"));
        Scene scene = new Scene(MasterPane.load());
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
}
