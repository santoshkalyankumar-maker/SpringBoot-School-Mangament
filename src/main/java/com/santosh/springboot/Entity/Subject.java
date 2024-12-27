package com.santosh.springboot.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(nullable = false, unique = true, length = 100)
    private String name;

    @Column(nullable = false)
    private Long classId;

    @Column(columnDefinition = "TEXT")
    private String syllabus;

    @Column(nullable = false)
    private Long teacherId;

    // Constructors
    public Subject() {}

    public Subject(String name, Long classId, String syllabus, Long teacherId) {
        this.name = name;
        this.classId = classId;
        this.syllabus = syllabus;
        this.teacherId = teacherId;
    }

    // Getters and Setters
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId=" + subjectId +
                ", name='" + name + '\'' +
                ", classId=" + classId +
                ", syllabus='" + syllabus + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
