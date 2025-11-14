package restaurant.exceptions;

import java.io.Serializable;

public class TableFullException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L; // Add this line

    public TableFullException(String message) {
        super(message);
    }
}
