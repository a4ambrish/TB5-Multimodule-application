package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Ipleading;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpleadingRepository extends CrudRepository<Ipleading,Double> {
}
