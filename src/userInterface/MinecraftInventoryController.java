package userInterface;

import CustomExceptions.BlankFieldException;
import CustomExceptions.HashTableException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import model.Game;

import java.net.URL;
import java.util.ResourceBundle;

public class MinecraftInventoryController implements Initializable {

    private Game game;

    @FXML
    private TextField numberCubesTXT;

    @FXML
    private TextField typeCubeTXT;

    @FXML
    private GridPane quickAccessBar;

    @FXML
    private GridPane inventoryTable;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        game = new Game();
    }



    @FXML
    void addCubeClicked(ActionEvent event) {

        try {
            int number = Integer.parseInt(numberCubesTXT.getText());
            game.addBlockToInventory(typeCubeTXT.getText(), number);

        }catch (NumberFormatException e){
            Alert alert = new Alert(Alert.AlertType.ERROR, "Causado por: \n" + "Caracteres invalidos" + ButtonType.CLOSE);
            alert.setHeaderText("Solo se admiten numeros en este campo");
            alert.show();

        }catch (BlankFieldException e){
            e.message();

        }catch (HashTableException e){
            e.message();
        }
    }

    @FXML
    void nextBarClicked(ActionEvent event) {

    }

    @FXML
    void previousBarClicked(ActionEvent event) {

    }

    @FXML
    void useCubeClicked(ActionEvent event) {

    }
}
