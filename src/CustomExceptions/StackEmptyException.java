package CustomExceptions;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class StackEmptyException extends Exception {

    public StackEmptyException() {
        super("La pila esta vacia");
    }

    public void message(){
        Alert alert = new Alert(Alert.AlertType.ERROR, "Causado por: \n" + "No hay elementos en la pila", ButtonType.CLOSE);
        alert.setHeaderText(super.getMessage());
        alert.show();
    }
}