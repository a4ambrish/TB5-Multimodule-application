package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Reptask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReptaskRepository extends CrudRepository<Reptask,Double> {
}
