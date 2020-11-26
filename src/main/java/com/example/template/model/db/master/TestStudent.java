package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.persistence.FetchType;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="test_student")
public class TestStudent implements Serializable {
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ref;

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    @JoinColumn(name="tests_ref")
    @Fetch(FetchMode.JOIN)
    private Tests tests;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    @JoinColumn(name="students_ref")
    @Fetch(FetchMode.JOIN)
    private Students students;

    private String test_date;
    private String result;

    public TestStudent() {
    }

    public TestStudent(Long ref, Tests tests, Students students, String test_date, String result) {
        this.ref = ref;
        this.tests = tests;
        this.students = students;
        this.test_date = test_date;
        this.result = result;
    }

    public Tests getTests() {
        return tests;
    }

    public void setTests(Tests tests) {
        this.tests = tests;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public String getTest_date() {
        return test_date;
    }

    public void setTest_date(String test_date) {
        this.test_date = test_date;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
