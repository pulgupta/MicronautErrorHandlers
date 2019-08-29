package example.exception;

import example.model.Error;

public class StudentNotFoundException extends RuntimeException {

    private final Error error;

    public StudentNotFoundException(Error error) {
        super(error.getMessage());
        this.error = error;
    }

    public Error getError() {
        return error;
    }
}
