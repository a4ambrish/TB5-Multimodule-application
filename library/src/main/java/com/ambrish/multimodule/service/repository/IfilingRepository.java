package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Ifiling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IfilingRepository extends CrudRepository<Ifiling,Double> {
}
