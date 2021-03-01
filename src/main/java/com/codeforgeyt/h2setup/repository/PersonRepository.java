package com.codeforgeyt.h2setup.repository;

import com.codeforgeyt.h2setup.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
