package sample;


import javafx.event.ActionEvent;


import java.io.IOException;

public class memberEvents {

    public void memberToHome(ActionEvent event) throws IOException {
        Main b = new Main();
        b.changeScene("sample.fxml");
    }
}

