package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Repdiary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepdiaryRepository extends CrudRepository<Repdiary,Double> {
}
