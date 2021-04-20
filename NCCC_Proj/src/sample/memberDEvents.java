package sample;
import javafx.event.ActionEvent;
import java.io.IOException;

public class memberDEvents {

    public void memberDToHome(ActionEvent event) throws IOException {
        Main d = new Main();
        d.changeScene("sample.fxml");
    }
}
