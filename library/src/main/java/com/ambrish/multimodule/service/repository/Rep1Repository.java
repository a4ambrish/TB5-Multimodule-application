package com.ambrish.multimodule.service.repository;

import com.ambrish.multimodule.service.Entity.Rep1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rep1Repository extends CrudRepository<Rep1,Double> {
}
