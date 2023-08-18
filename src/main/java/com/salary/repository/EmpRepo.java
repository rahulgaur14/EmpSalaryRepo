package com.salary.repository;

import com.salary.entity.EmpSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<EmpSalary, Integer> {
   // List<EmpSalary> findByESalary(double eSalary);
}
