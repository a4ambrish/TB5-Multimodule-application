package com.ambrish.multimodule.service.repository;


import com.ambrish.multimodule.service.Entity.Login;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Login,String> {
}
