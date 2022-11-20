package one.digitalinnovation.parking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkinNotFoundException extends RuntimeException {

    public ParkinNotFoundException(String id) {
        super("Parking not found with id: " + id);
    }

}
