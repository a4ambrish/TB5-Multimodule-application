package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Path;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathRepository extends CrudRepository<Path,String> {
}
