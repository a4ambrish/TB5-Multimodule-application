package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Introl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntrolRepository extends CrudRepository<Introl,Double> {
}
