package sample;
import javafx.event.ActionEvent;
import java.io.IOException;

public class chamberEvents {

    public void chamberToHome(ActionEvent event) throws IOException {
        Main f = new Main();
        f.changeScene("sample.fxml");
    }
}
