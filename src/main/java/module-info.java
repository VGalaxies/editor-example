module com.example.editor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.editor to javafx.fxml;
    exports com.example.editor;
}