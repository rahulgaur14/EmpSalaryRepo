package com.salary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "empsal_tab")
public class EmpSalary {
    @Id
    private int eId;
    private String eName;
    private double eSalary;
    private double ta;
    private double da;
    private double hra;
    private double pf;
    private double grossSalary;
    private double netSalary;
}
