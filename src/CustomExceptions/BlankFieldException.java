package CustomExceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class BlankFieldException extends Exception {

    public BlankFieldException() {
        super("Todos los campos tienen que estar diligenciados correctamente");
    }

    public void message(){
        Alert alert = new Alert(Alert.AlertType.ERROR, "Causado por: \n" + "Espacio en blanco", ButtonType.CLOSE);
        alert.setHeaderText(super.getMessage());
        alert.show();
    }
}
