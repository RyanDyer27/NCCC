package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import java.io.IOException;




public class localResources {

    public void localResourcesToHome(ActionEvent event) throws IOException {
        Main e = new Main();
        e.changeScene("sample.fxml");
    }
}
