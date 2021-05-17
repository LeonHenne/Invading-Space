package GUI;

import Klassen.Raumschiff;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import java.io.IOException;

public class Startbildschirmcontroller {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TextField txt_Namensfeld;


    public void normal(ActionEvent e)throws IOException{
        System.out.println("Spielmodus: Normal");
        wechselZuGamescreen(e);
    }
    public void hölle(ActionEvent e) throws IOException {
        System.out.println("Spielmodus: HÖLLE");
        wechselZuGamescreen(e);
    }

    public void wechselZuGamescreen(ActionEvent e) throws IOException {
        //Main klasse des Spielbildschirms
        //TODO: Überprüfung text leer und kein komma

        String spielername = txt_Namensfeld.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Spielbildschirm.fxml"));
        root = loader.load();
        Spielbildschirmcontroller spielcontroller = loader.getController();
        //ab hier soll der spielbildschirmcontroller übernehmen
        spielcontroller.aktiviereSpielfeld(e,spielername, root);
    }

}
