package com.aws.codestar.projecttemplates.model;

import java.util.UUID;

public class ClassElective {
    private final UUID classId;
    private final UUID electiveFinal;

    public ClassElective(UUID classId, UUID electiveFinal) {
        this.classId = classId;
        this.electiveFinal = electiveFinal;
    }

    public UUID getClassId() {
        return classId;
    }

    public UUID getElectiveFinal() {
        return electiveFinal;
    }
}
