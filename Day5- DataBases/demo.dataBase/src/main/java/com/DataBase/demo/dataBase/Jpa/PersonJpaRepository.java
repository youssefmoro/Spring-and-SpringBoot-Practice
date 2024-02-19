package com.DataBase.demo.dataBase.Jpa;

import com.DataBase.demo.dataBase.Entity.Person;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonJpaRepository extends CrudRepository<Person, Integer> {



}
