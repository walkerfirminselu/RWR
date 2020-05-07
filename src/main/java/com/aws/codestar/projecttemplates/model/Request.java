package com.aws.codestar.projecttemplates.model;

import java.util.UUID;

public class Request {
    private final UUID id;
    private final UUID userId;
    private final Boolean isAccepted;

    public Request(UUID id, UUID userId, Boolean isAccepted) {
        this.id = id;
        this.userId = userId;
        this.isAccepted = isAccepted;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public Boolean getAccepted() {
        return isAccepted;
    }
}
