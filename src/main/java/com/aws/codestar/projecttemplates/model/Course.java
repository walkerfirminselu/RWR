package com.aws.codestar.projecttemplates.model;

import java.util.UUID;

public class Course {
    private final UUID id;
    private final String courseCode;
    private final String courseName;

    public Course(UUID id, String courseCode, String courseName) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public UUID getId() {
        return id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}
