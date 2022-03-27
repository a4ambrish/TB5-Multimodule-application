package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Journal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRepository extends CrudRepository<Journal,Double> {
}
