package ru.geekbrains.classes.lesson4.javafx.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.layout.BorderPane;
import ru.geekbrains.classes.lesson4.Message;

import java.io.IOException;

public class MessageCellController extends ListCell<Message> {
    @FXML
    public Label lbUserName;

    @FXML
    public Label lbMessage;

    @FXML
    public BorderPane cellLayout;

    private FXMLLoader fxmlLoader;

    @Override
    protected void updateItem(Message msg, boolean empty) {
        super.updateItem(msg, empty);

        if (empty || msg == null) {
            setText(null);
            setGraphic(null);
        } else {
            if (fxmlLoader == null) {
                fxmlLoader = new FXMLLoader(getClass().
                        getResource("/fxml/message_cell.fxml"));
                fxmlLoader.setController(this);
                try {
                    fxmlLoader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            lbUserName.setText(msg.getUserName());
            lbMessage.setText(msg.getMessage());
            setText(null);
            setGraphic(cellLayout);
        }
    }
}
