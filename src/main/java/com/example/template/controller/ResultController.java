package com.example.template.controller;

import com.example.template.model.db.master.*;
import com.example.template.repositories.SubTestRepository;
import com.example.template.repositories.SubTestResultRepository;
import com.example.template.repositories.TestStudentRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;
/*
@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    ResultRepository resultRepository;
    @Autowired
    SubTestResultRepository subTestResultRepository;
    @Autowired
    TestStudentRepository testStudentRepository;

    @GetMapping(value = "/list")
    public List<Result> listTestJoin(HttpSession httpSession){
        Iterable<Result> sts = resultRepository.findAll();
        return Lists.newArrayList(sts);
    }

    @PostMapping("/teststudent/{test_student_ref}/subtest/{sub_test}")
    public ResponseEntity<Result> getById(@PathVariable (value = "test_student_ref") Long test_student_ref,
                                          @PathVariable (value = "sub_test_result") Long sub_test_result,
                                          Result result) {


        Optional<TestStudent> optionalTestStudent = testStudentRepository.findById(test_student_ref);
        if (!optionalTestStudent.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Optional<SubTestResult> optionalSubTestResult = subTestResultRepository.findById(sub_test_result);
        if (!optionalSubTestResult.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        result.setTestStudent(optionalTestStudent.get());
        result.setSubTestResult(optionalSubTestResult.get());

        Result savedResult = resultRepository.save(result);

        return  ResponseEntity.ok(savedResult);
    }
}*/
