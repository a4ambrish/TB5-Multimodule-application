package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {
}
