package com.example.case_study;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.text.TextAlignment;

public class ClientController {
    @FXML
    private ListView<String> left;
    @FXML
    private ListView<String> right;

    @FXML
    private void click() {
        ObservableList<String> items = FXCollections.observableArrayList("item1","item2");
        right.setItems(items);
        right.setCellFactory(param -> new CustomListCell());
    }
}