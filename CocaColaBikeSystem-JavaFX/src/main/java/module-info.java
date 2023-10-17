module com.example.cocacolabikesystemjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.cocacolabikesystemjavafx to javafx.fxml;
    exports com.example.cocacolabikesystemjavafx;
}