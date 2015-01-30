package ru.vaszol;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import ru.vaszol.model.Group;
import ru.vaszol.view.MainFrameController;
import ru.vaszol.view.RootLayoutController;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;


    private ObservableList<Group> group = FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage=primaryStage;
        this.primaryStage.setTitle("DOPOG");

        initRootLayout();

        showPersonOverview();

    }

    private void initRootLayout() {
        try {
            // Load root layout from fxml file.
            // загрузка еорневой разметки из fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class
                    .getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            // Show the scene containing the root layout.
            // показать контейнер сцены корневой разметки.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);

            // Give the controller access to the main app.
            RootLayoutController controller = loader.getController();
            controller.setMainApp(this);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
// Try to load last opened person file.
        /*File file = getPersonFilePath();
        if (file != null) {
            loadPersonDataFromFile(file);
        }*/
    }

    private void showPersonOverview() {
        try {
            // Load MainFrame.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/MainFrame.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

            // Set MainFrame into the center of root layout.
            rootLayout.setCenter(personOverview);

            // Give the controller access to the main app.
            MainFrameController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }


}
