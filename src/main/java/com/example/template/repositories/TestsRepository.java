package com.example.template.repositories;

import com.example.template.model.db.master.Tests;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TestsRepository extends CrudRepository<Tests, Long> {
    public List<Tests> findByRef(int _ref);
}
