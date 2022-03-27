package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Repappo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepappoRepository extends CrudRepository<Repappo,Double> {
}
