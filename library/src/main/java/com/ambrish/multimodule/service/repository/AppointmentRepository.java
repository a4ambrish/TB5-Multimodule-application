package com.ambrish.multimodule.service.repository;



import com.ambrish.multimodule.service.Entity.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository <Appointment, Double> {
}
