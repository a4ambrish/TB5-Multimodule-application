package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Repcit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepcitRepository extends CrudRepository<Repcit,Double> {
}
