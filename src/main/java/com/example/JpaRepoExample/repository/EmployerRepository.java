package com.example.JpaRepoExample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.JpaRepoExample.model.Employee;

@Component
@Repository
public interface EmployerRepository extends CrudRepository<Employee, Long>{

}
