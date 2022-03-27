package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Iopassed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IopassedRepository extends CrudRepository<Iopassed,Double> {
}
