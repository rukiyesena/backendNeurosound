package com.example.template.controller;

import com.example.template.model.db.master.*;
import com.example.template.repositories.StudentsRepository;
import com.example.template.repositories.TestStudentRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
/*
@RestController
@RequestMapping("/asdf")
public class ResultsController {
    @Autowired
    ResultsRepository resultsRepository;
    @Autowired
    TestStudentRepository testStudentRepository;

    @GetMapping(value = "/list")
    public List<Results> listTestJoin(HttpSession httpSession){
        Iterable<Results> sts = resultsRepository.findAll();
        return Lists.newArrayList(sts);
    }
     @GetMapping("/teststudent/{test_student_ref}/filter")
    public Optional<Results> getAllTest(@PathVariable (value = "test_student_ref") Long test_student_ref) {
        return resultsRepository.findByTestStudentRef(test_student_ref);
    }
   @PostMapping("/teststudent/{test_student_ref}/add")
    public ResponseEntity<Results> getById(@PathVariable (value = "test_student_ref") Long test_student_ref,
                                               Results results) {
        Optional<TestStudent> optionalTestStudent = testStudentRepository.findById(test_student_ref);
        if (!optionalTestStudent.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        results.setTestStudent(optionalTestStudent.get());

        Results savedresult = resultsRepository.save(results);


        return  ResponseEntity.ok(savedresult);
    }

    @PutMapping("/teststudent/{test_student_ref}/ad/{ref}/put")
    public ResponseEntity<Results> update(@PathVariable (value = "test_student_ref") Long test_student_ref,
                                              @PathVariable (value="ref") Long ref,
                                          Results results) {
        Optional<TestStudent> optionalTestStudent = testStudentRepository.findById(test_student_ref);
        if (!optionalTestStudent.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        Optional<Results> optionalResults= resultsRepository.findById(ref);
        if (!optionalResults.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        results.setTestStudent(optionalTestStudent.get());
        results.setRef(optionalResults.get().getRef());
        resultsRepository.save(results);

        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/delete",  method = RequestMethod.DELETE)
    public void deleteResult(HttpSession httpSession, Results results){
        resultsRepository.delete(results);
    }
}*/
