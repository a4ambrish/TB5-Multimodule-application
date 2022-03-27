package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,Double> {
}
