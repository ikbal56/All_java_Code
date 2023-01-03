package com.te.emp.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.te.emp.dto.Emp;

@Repository
public interface EmpRepo extends CrudRepository<Emp, Integer> {

}
