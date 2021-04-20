package sample;
import javafx.fxml.FXML;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class homePage {

    public homePage() {

    }

    // initialize buttons
    @FXML
    private Button cEventsButton;
    @FXML
    private Button mEventsButton;
    @FXML
    private Button mDirectoryButton;
    @FXML
    private Button engageWithUsButton;
    @FXML
    private Button localResourcesButton;
    @FXML
    private Button helpButton;

    //cEvents
    public void chamberEvents(ActionEvent event) throws IOException {
        homeToChamber();
    }

    public void homeToChamber() throws IOException {
        Main m = new Main();
        m.changeScene("chamberEventsScene.fxml");
    }
    //mEvents
    public void memberEvents(ActionEvent event) throws IOException {
        homeToMember();
    }

    private void homeToMember() throws IOException{
        Main n = new Main();
        n.changeScene("memberEventsScene.fxml");
    }

    //mDirectory
    public void memberDirectory(ActionEvent event) throws IOException{
        homeToMemberD();
    }

    private void homeToMemberD() throws IOException{
        Main o = new Main();
        o.changeScene("memberDirectoryScene.fxml");
    }

    //engageWithUs
    public void engageWithUs(ActionEvent event) throws IOException{
        hometoEngageWithUs();
    }

    private void hometoEngageWithUs() throws IOException{
        Main p = new Main();
        p.changeScene("engageWithUsScene.fxml");
    }

    //localResources
    public void localResources(ActionEvent event) throws IOException {
        homeToLocalResources();
    }

    private void homeToLocalResources() throws IOException {
        Main q = new Main();
        q.changeScene("localResourcesScene.fxml");
    }
    //help
    public void help(ActionEvent event) throws IOException {
        homeToHelp();
    }

    private void homeToHelp() throws IOException{
        Main r = new Main();
        r.changeScene("helpButtonScene.fxml");
    }


}