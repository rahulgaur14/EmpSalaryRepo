package com.salary.service;

import com.salary.entity.EmpSalary;

import java.util.List;
import java.util.stream.Stream;

public interface EmpService {
    public EmpSalary saveEmp(EmpSalary empSalary);
    public EmpSalary deleteEmp(Integer eId);
    public List<EmpSalary> getAll();
    public EmpSalary getEmp(Integer eId);
    public List<EmpSalary> getSal(double eSal);
    public EmpSalary updateEmp(EmpSalary empSalary, Integer eId);
}
