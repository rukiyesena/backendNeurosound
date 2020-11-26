package com.example.template.controller;

import com.example.template.model.db.master.TestStudent;
import com.example.template.repositories.StudentsRepository;
import com.example.template.repositories.TestStudentRepository;
import com.example.template.repositories.TestsRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManagerFactory;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class TestStudentController {
    @Autowired
    TestStudentRepository testStudentRepository;

    @Autowired
    TestsRepository testsRepository;
    @Autowired
    StudentsRepository studentsRepository;

    @Autowired
    EntityManagerFactory emf;

 /*   @GetMapping("/join/cross")
    public ResponseEntity<List<TestStudentObject>> getLeftCrossData() {
        return new ResponseEntity<List<TestStudentObject>>(testStudentRepository.fetchDataCrossJoin(), HttpStatus.OK);
    }*/

    @GetMapping(value = "/list")
    public List<TestStudent> listTestJoin(HttpSession httpSession){
        Iterable<TestStudent> sts = testStudentRepository.findAll();
        return Lists.newArrayList(sts);
    }
/*    @PostMapping("/tests/{tests_ref}/student/{student_ref}/add")
    public ResponseEntity<TestStudent> getById(@PathVariable (value = "tests_ref") Long tests_ref,
                                               @PathVariable (value = "student_ref") Long student_ref,
                                               TestStudent testStudent) {
        Optional<TestStudent> optionalTests = testStudentRepository.findByTestsRef(tests_ref);
        if (!optionalTests.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        Optional<TestStudent> optionalStudents = testStudentRepository.findByStudentsRef(student_ref);
        if (!optionalTests.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }
        testStudent.setTests(optionalTests.get());
        testStudent.setStudents(optionalStudents.get());

        TestStudent savedTestStudent = testStudentRepository.save(testStudent);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedTestStudent.getRef()).toUri();

        return ResponseEntity.created(location).body(savedTestStudent);
    }
   */
    @GetMapping("/tests/{tests_ref}/test_student")
    public Optional<TestStudent> getAllTest(@PathVariable (value = "tests_ref") Long tests_ref) {
        return testStudentRepository.findByTestsRef(tests_ref);
    }
    @GetMapping("/students/{students_ref}/test_student")
    public Optional<TestStudent> getAllTestStudentByStudent(@PathVariable (value = "students_ref") Long students_ref) {
        return testStudentRepository.findByStudentsRef(students_ref);
    }
    //   Optional.of(optionalTests).filter(testStudentRepository.findByTestsRefAndStudentsRef(tests_ref, student_ref));
    @GetMapping("/tests/{tests_ref}/student/{student_ref}/list/{ref}")
    public ResponseEntity<TestStudent> getAllTestAndStudent(@PathVariable (value = "tests_ref") Long tests_ref,
                                                      @PathVariable (value = "student_ref") Long student_ref,
                                                      @PathVariable (value="ref") Long ref,
                                                      TestStudent testStudent) {
        Optional<TestStudent> optionalTests = testStudentRepository.findByTestsRefAndStudentsRefAndRef(tests_ref, student_ref, ref);
        if (!optionalTests.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalTests.get());
    }
    @GetMapping("/tests/{tests_ref}/student/{student_ref}/filter")
    public Page<TestStudent> filterAllTestAndStudent(@PathVariable (value = "tests_ref") Long tests_ref,
                                                     @PathVariable (value = "student_ref") Long student_ref,
                                                     Pageable pageable) {
        return testStudentRepository.findByTestsRefAndStudentsRef(tests_ref, student_ref, pageable);
    }
}
