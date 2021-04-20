package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

public class helpToHome {

    public void helpToHome(ActionEvent event) throws IOException {
        Main q = new Main();
        q.changeScene("sample.fxml");
    }
}
