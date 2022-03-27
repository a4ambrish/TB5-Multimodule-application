package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Rep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepRepository extends CrudRepository<Rep,Double> {
}
