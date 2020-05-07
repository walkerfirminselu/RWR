package com.aws.codestar.projecttemplates.model;

import java.util.Date;
import java.util.UUID;

public class Message {
    private final UUID id;
    private final UUID requestId;
    private final String messageBody;
    private final Date timeSent;

    public Message(UUID id, UUID requestId, String messageBody, Date timeSent) {
        this.id = id;
        this.requestId = requestId;
        this.messageBody = messageBody;
        this.timeSent = timeSent;
    }

    public UUID getId() {
        return id;
    }

    public UUID getRequestId() {
        return requestId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public Date getTimeSent() {
        return timeSent;
    }
}
