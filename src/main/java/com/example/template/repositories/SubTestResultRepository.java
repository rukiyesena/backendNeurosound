package com.example.template.repositories;


import com.example.template.model.db.master.SubTestResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubTestResultRepository extends CrudRepository<SubTestResult, Long> {
}
