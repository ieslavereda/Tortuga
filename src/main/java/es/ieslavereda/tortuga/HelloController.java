package es.ieslavereda.tortuga;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class HelloController {
    @FXML
    private Button btnStart;
    @FXML
    private ProgressBar pbTortuga;
    @FXML
    private ProgressBar pbLiebre;
    @FXML
    protected void onHelloButtonClick() {

        pbTortuga.setProgress(0.4);
        pbLiebre.setProgress(0.1);

    }
}