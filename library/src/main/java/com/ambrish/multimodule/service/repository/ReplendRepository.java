package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Replend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplendRepository extends CrudRepository<Replend,Double> {
}
