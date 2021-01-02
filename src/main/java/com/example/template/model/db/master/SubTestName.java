package com.example.template.model.db.master;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
/*
@Entity
@Table(name="sub_test_name")
public class SubTestName {
    @Column
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long ref;
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="tests_ref")
    @Fetch(FetchMode.JOIN)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ref")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("tests_ref")
    private Tests tests;

    public SubTestName() {
    }

    public SubTestName(Long ref, String name, Tests tests) {
        this.ref = ref;
        this.name = name;
        this.tests = tests;
    }

    public Long getRef() {
        return ref;
    }

    public void setRef(Long ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tests getTests() {
        return tests;
    }
    @JsonProperty("tests_ref")
    public void setTests(Tests tests) {
        this.tests = tests;
    }
}*/
