package com.example.template.repositories;

import com.example.template.model.db.master.Advice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdviceRepository extends CrudRepository<Advice, Long> {
}
