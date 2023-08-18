package com.salary.controller;

import com.salary.entity.EmpSalary;
import com.salary.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private EmpService service;

    @PostMapping("/save")
    public String saveEmp(@RequestBody EmpSalary empSalary)
    {
        EmpSalary s1 = service.saveEmp(empSalary);
        String msg = null;
        if(s1!=null)
        {
            msg = "Data Saved Successfully";
        }
        else {
            msg ="Data not saved";
        }
        return msg;
    }
    @DeleteMapping("/delete/{eId}")
    public String delete(@PathVariable Integer eId){
        EmpSalary s2 = service.deleteEmp(eId);
        return "Data deleted Successfully";
    }
    @GetMapping("/get/{eId}")
    public EmpSalary getEmp(@PathVariable Integer eId)
    {
        return service.getEmp(eId);
    }
    @GetMapping("/get/sal/{eSalary}")
    public List<EmpSalary> getSal(@PathVariable double eSalary)
    {

        return service.getSal(eSalary);
    }
    @GetMapping("/getall")
    public List<EmpSalary> getAll(){
        return service.getAll();
    }
    @PutMapping("/update/{eId}")
    public String updateEmp(@RequestBody EmpSalary empSalary, @PathVariable Integer eId) {
        EmpSalary s1 = service.updateEmp(empSalary,eId);
        String msg = null;
        if (s1 != null) {
            msg = "Data Updated Successfully";
        } else {
            msg = "Data not updated";
        }
        return msg;
    }
}
