package com.example.template.controller;

import com.example.template.model.db.master.SubTestResult;
import com.example.template.model.db.master.Tests;
import com.example.template.repositories.TestsRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;
/*
@RestController
@RequestMapping("/subtestname")
public class SubTestNameController {
    @Autowired
    SubTestNameRepository subTestNameRepository;
    @Autowired
    TestsRepository testsRepository;
    @GetMapping(value = "/list")
    public List<SubTestName> listTestJoin(HttpSession httpSession){
        Iterable<SubTestName> sts = subTestNameRepository.findAll();
        return Lists.newArrayList(sts);
    }

    @GetMapping(value = "/test/{tests_ref}")
    public List<SubTestName> filterAllTestAndStudent(@PathVariable (value = "tests_ref") Long tests_ref,
                                                     SubTestName subTestName){
        return subTestNameRepository.findByTestsRef(tests_ref);
    }
}*/
