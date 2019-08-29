package example.model;

import java.io.Serializable;

public class Error implements Serializable {

    static final long serialVersionUID = 1L;

    private final String message;
    private final String messageId;

    public Error(String message, String messageId) {
        this.message = message;
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageId() {
        return messageId;
    }
}
