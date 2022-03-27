package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Filing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilingRepository extends CrudRepository<Filing,Double> {
}
