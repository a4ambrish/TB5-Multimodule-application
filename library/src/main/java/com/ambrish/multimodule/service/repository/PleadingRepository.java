package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Pleading;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PleadingRepository extends CrudRepository<Pleading,Double> {
}
