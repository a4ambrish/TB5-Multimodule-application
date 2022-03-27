package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Repcase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepcaseRepository extends CrudRepository<Repcase,Double> {
}
