module org.example.htmleditor {
    requires javafx.fxml;
    requires javafx.web;
    requires org.apache.commons.io;


    opens org.example.htmleditor to javafx.fxml;
    exports org.example.htmleditor;
}