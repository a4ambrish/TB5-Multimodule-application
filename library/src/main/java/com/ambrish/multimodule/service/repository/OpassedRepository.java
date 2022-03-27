package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Opassed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpassedRepository extends CrudRepository<Opassed,Double> {
}
