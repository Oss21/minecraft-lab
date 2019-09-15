package CustomExceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class HashTableException extends Exception {

    public HashTableException() {
        super("Elimina bloques de tu inventario, para agregar mas.");
    }

    public void message(){
        Alert alert = new Alert(Alert.AlertType.ERROR, "Causado por: \n" + "El inventario esta a su maxima capacidad", ButtonType.CLOSE);
        alert.setHeaderText(super.getMessage());
        alert.show();
    }

}
