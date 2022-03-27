package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task,Double> {
}
