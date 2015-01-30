package ru.vaszol.view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import ru.vaszol.Main;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * Created by vas on 29-Jan-15.
 */
public class MainFrameController implements Initializable {


    @FXML
    private ListView<String> listView;
    private Set<String> stringSet;
    ObservableList observableList = FXCollections.observableArrayList();
    @FXML
    private ImageView photoView;
    @FXML
    private ImageView signView;
    @FXML
    private Label nameLbl;
    @FXML
    private Label groupLbl;
    @FXML
    private Button showGroupBtn;
    @FXML
    private Button dirPhotoBtn;
    @FXML
    private Button dirThisPhotoBtn;
    @FXML
    private Button photoBtn;
    @FXML
    private Button dirSignBtn;
    @FXML
    private Button dirThisSignBtn;
    @FXML
    private Button signBtn;
    @FXML
    private Button outBtn;

    private Main mainApp;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    public Main getMainApp() {
        return mainApp;
    }

    private void showMainDetails (){
//        заполнение элементов окна значениями

    }

    @FXML
    private void handleShowGrpupBtn(ActionEvent event){
    /**кнопка загрузки списка*/

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> data = FXCollections.observableArrayList(
                "hello","w","o","r","ld!"
        );
        listView.setItems(data);
    }
}
