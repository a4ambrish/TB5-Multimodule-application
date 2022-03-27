package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Stopic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StopicRepository extends CrudRepository<Stopic,Double> {
}
