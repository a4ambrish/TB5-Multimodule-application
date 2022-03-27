package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour,Double> {
}
