package com.aws.codestar.projecttemplates.model;

import java.util.UUID;

public class UserClass {
    private final UUID userId;
    private final UUID roleId;

    public UserClass(UUID userId, UUID roleId) {
        this.userId = userId;
        this.roleId = roleId;
    }

    public UUID getUserId() {
        return userId;
    }

    public UUID getRoleId() {
        return roleId;
    }
}
