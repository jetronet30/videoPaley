package com.jaba.videopaley;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.*;


public class MasterPane_Controller {
    //////////////////////////////////////////////
    @FXML
    private MediaView medV;
    @FXML
    private AnchorPane m_pane;
    ////////////////////////////////////////////////
    @FXML
    private void initialize() throws IOException {

        Media media = new Media("http://localhost:8080/files/sample-5s.mp4");

        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        medV.setMediaPlayer(mediaPlayer);
        mediaPlayer.bufferProgressTimeProperty();


        /*
        m_pane.widthProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                medV.setFitWidth(m_pane.getWidth());
            }
        });

        m_pane.heightProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                medV.setFitHeight(m_pane.getHeight());
            }
        });

         */
    }
}
