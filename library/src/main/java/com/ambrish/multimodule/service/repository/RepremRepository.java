package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Reprem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepremRepository extends CrudRepository<Reprem,Double> {
}
