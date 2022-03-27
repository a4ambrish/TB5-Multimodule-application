package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Proposition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropositionRepository extends CrudRepository<Proposition,Double> {
}
