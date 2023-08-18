package com.salary.service;

import com.salary.entity.EmpSalary;
import com.salary.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmpServiceImp implements EmpService{
    @Autowired
    private EmpRepo empRepo;
    @Override
    public EmpSalary saveEmp(EmpSalary empSalary) {
        double sal = empSalary.getESalary();
        double ta,da,hra,pf,gs,ns;
        int eid = empSalary.getEId();
        String ename = empSalary.getEName();
        EmpSalary e1 = new EmpSalary();
        e1.setEId(eid);
        e1.setEName(ename);
        e1.setESalary(sal);
        if(sal<30000)
        {
             ta = sal*0.07;
            e1.setTa(ta);
             da = sal*0.09;
            e1.setDa(da);
             hra = sal*0.11;
            e1.setHra(hra);
             pf = sal*0.15;
            e1.setPf(pf);
             gs = sal+ta+da+hra;
            e1.setGrossSalary(gs);
             ns = gs - pf;
            e1.setNetSalary(ns);
        }
        else if(sal>=30000 && sal<50000)
        {
             ta = sal*0.12;
            e1.setTa(ta);
             da = sal*0.13;
            e1.setDa(da);
             hra = sal*0.17;
            e1.setHra(hra);
             pf = sal*0.22;
            e1.setPf(pf);
             gs = sal+ta+da+hra;
            e1.setGrossSalary(gs);
             ns = gs - pf;
            e1.setNetSalary(ns);
        }
        else
        {
             ta = sal*0.17;
            e1.setTa(ta);
             da = sal*0.19;
            e1.setDa(da);
             hra = sal*0.21;
            e1.setHra(hra);
             pf = sal*0.25;
            e1.setPf(pf);
             gs = sal+ta+da+hra;
            e1.setGrossSalary(gs);
             ns = gs - pf;
            e1.setNetSalary(ns);
        }
        return empRepo.save(e1);
    }

    @Override
    public EmpSalary deleteEmp(Integer eId) {
       empRepo.deleteById(eId);
       return null;
    }

    @Override
    public List<EmpSalary> getAll() {
        return empRepo.findAll();
    }

    @Override
    public EmpSalary getEmp(Integer eId) {
        return empRepo.findById(eId).get();
    }

    @Override
    public List<EmpSalary> getSal(double eSalary) {

        return empRepo.findAll().stream().filter(empSalary -> empSalary.getESalary()==eSalary).collect(Collectors.toList());
    }

    @Override
    public EmpSalary updateEmp(EmpSalary empSalary, Integer eId) {
        EmpSalary e3 = empRepo.findById(eId).get();
        double sal = empSalary.getESalary();
        double ta,da,hra,pf,gs,ns;
        e3.setEId(eId);
        e3.setEName(empSalary.getEName());
        e3.setESalary(sal);
        if(sal<30000)
        {
            ta = sal*0.07;
            e3.setTa(ta);
            da = sal*0.09;
            e3.setDa(da);
            hra = sal*0.11;
            e3.setHra(hra);
            pf = sal*0.15;
            e3.setPf(pf);
            gs = sal+ta+da+hra;
            e3.setGrossSalary(gs);
            ns = gs - pf;
            e3.setNetSalary(ns);
        }
        else if(sal>=30000 && sal<50000)
        {
            ta = sal*0.12;
            e3.setTa(ta);
            da = sal*0.13;
            e3.setDa(da);
            hra = sal*0.17;
            e3.setHra(hra);
            pf = sal*0.22;
            e3.setPf(pf);
            gs = sal+ta+da+hra;
            e3.setGrossSalary(gs);
            ns = gs - pf;
            e3.setNetSalary(ns);
        }
        else
        {
            ta = sal*0.17;
            e3.setTa(ta);
            da = sal*0.19;
            e3.setDa(da);
            hra = sal*0.21;
            e3.setHra(hra);
            pf = sal*0.25;
            e3.setPf(pf);
            gs = sal+ta+da+hra;
            e3.setGrossSalary(gs);
            ns = gs - pf;
            e3.setNetSalary(ns);
        }
        return empRepo.save(e3);
    }
}
