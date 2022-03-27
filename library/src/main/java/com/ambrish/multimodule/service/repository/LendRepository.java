package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Lend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendRepository extends CrudRepository<Lend,Double> {
}
