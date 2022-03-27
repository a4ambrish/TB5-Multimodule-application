package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Double> {
}
