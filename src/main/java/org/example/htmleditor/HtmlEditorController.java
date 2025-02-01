package org.example.htmleditor;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.apache.commons.io.FileUtils;

public class HtmlEditorController {
    @FXML
    private TextArea codeEditor;
    @FXML
    private WebView webView;

    private WebEngine engine;

    @FXML
    public void initialize() {
        this.engine = webView.getEngine(); // Инициализация WebEngine должна происходить здесь
    }


    @FXML
    public void previewCode(ActionEvent event) {
        String htmlContent = "<!DOCTYPE html>\n" + codeEditor.getText();
        engine.loadContent(htmlContent);
    }

    @FXML
    public void saveFile(ActionEvent event) {
        try {
            File file = new File("output.html");
            FileUtils.writeStringToFile(file, codeEditor.getText(), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void openFile(ActionEvent event) {
        try {
            File file = new File("input.html");
            if (file.exists()) {
                String content = FileUtils.readFileToString(file, "UTF-8");
                codeEditor.setText(content);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}