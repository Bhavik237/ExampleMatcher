package com.api.examplematcher.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class CourseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long courseId;

        @Column(name = "name")
        private String courseName;

        @Column(name = "description")
        private String courseDescription;

        @Column(name = "status")
        private Long courseStatus;

        public CourseEntity() {
        }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setCourseStatus(Long courseStatus) {
        this.courseStatus = courseStatus;
    }

    public CourseEntity(String courseName, String courseDescription, Long courseStatus) {
            this.courseName = courseName;
            this.courseDescription = courseDescription;
            this.courseStatus = courseStatus;
        }


        public String getCourseName() {
            return courseName;
        }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseDescription() {
            return courseDescription;
        }

        public Long getCourseStatus() {
            return courseStatus;
        }
}
