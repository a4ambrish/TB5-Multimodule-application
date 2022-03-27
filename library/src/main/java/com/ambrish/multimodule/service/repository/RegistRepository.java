package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Regist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistRepository extends CrudRepository<Regist,String> {
}
