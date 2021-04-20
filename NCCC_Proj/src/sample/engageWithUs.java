package sample;
import javafx.event.ActionEvent;
import java.io.IOException;
public class engageWithUs {


    public void engageToHome(ActionEvent event) throws IOException {
        Main a = new Main();
        a.changeScene("sample.fxml");
    }
}
