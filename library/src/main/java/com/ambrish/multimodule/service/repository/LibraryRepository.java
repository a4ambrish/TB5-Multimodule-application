package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Library;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends CrudRepository<Library,Double> {
}
