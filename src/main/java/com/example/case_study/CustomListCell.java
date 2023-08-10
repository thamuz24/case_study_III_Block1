package com.example.case_study;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.HBox;

public class CustomListCell extends ListCell<String> {
    private HBox content;

    public CustomListCell() {
        super();
        Label label = new Label();
        label.setAlignment(Pos.CENTER_RIGHT);

        content = new HBox(label);
        content.setAlignment(Pos.CENTER_RIGHT);
    }

    @Override
    protected void updateItem(String item, boolean empty) {
        super.updateItem(item, empty);

        if (empty || item == null) {
            setGraphic(null);
        } else {
            ((Label) content.getChildren().get(0)).setText(item);
            setGraphic(content);
        }
    }
}
