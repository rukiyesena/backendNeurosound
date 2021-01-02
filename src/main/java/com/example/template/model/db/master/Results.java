package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;
import com.fasterxml.jackson.annotation.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
/*
@Entity
@Table(name="results")
public class Results  {

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

    private String result_1;
    private String result_2;
    private String result_3;
    private String result_4;
    private String result_5;
    private String result_6;
    private String result_7;
    private String result_8;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="test_student_id" , nullable = true)
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ref")
    @JsonIdentityReference(alwaysAsId = true)
    @JsonProperty("test_student_id")
    private TestStudent testStudent;


    public Results() {
    }

    public Results(String result_1, String result_2, String result_3, String result_4) {
        this.result_1 = result_1;
        this.result_2 = result_2;
        this.result_3 = result_3;
        this.result_4 = result_4;

    }

    public Results(Long ref, String result_1, String result_2, String result_3, String result_4, String result_5, String result_6, String result_7, String result_8) {
        this.ref = ref;
        this.result_1 = result_1;
        this.result_2 = result_2;
        this.result_3 = result_3;
        this.result_4 = result_4;
        this.result_5 = result_5;
        this.result_6 = result_6;
        this.result_7 = result_7;
        this.result_8 = result_8;
    }

    public String getResult_1() {
        return result_1;
    }

    public void setResult_1(String result_1) {
        this.result_1 = result_1;
    }

    public String getResult_2() {
        return result_2;
    }

    public void setResult_2(String result_2) {
        this.result_2 = result_2;
    }

    public String getResult_3() {
        return result_3;
    }

    public void setResult_3(String result_3) {
        this.result_3 = result_3;
    }

    public String getResult_4() {
        return result_4;
    }

    public void setResult_4(String result_4) {
        this.result_4 = result_4;
    }

    public String getResult_5() {
        return result_5;
    }

    public void setResult_5(String result_5) {
        this.result_5 = result_5;
    }

    public String getResult_6() {
        return result_6;
    }

    public void setResult_6(String result_6) {
        this.result_6 = result_6;
    }

    public String getResult_7() {
        return result_7;
    }

    public void setResult_7(String result_7) {
        this.result_7 = result_7;
    }

    public String getResult_8() {
        return result_8;
    }

    public void setResult_8(String result_8) {
        this.result_8 = result_8;
    }




}*/
