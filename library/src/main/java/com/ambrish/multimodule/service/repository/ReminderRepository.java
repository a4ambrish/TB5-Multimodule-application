package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Reminder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder,Double> {
}
