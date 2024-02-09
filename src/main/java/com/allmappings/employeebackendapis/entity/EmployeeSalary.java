package com.allmappings.employeebackendapis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EmployeeSalary {
    @Id
    private Integer salaryId;
    @Column(name = "emp_hra")
    private Double hra;
    @Column(name = "emp_netSalary")
    private Double netSalary;
    @Column(name = "emp_tdx")
    private Double tdx;
    @Column(name = "emp_bonus")
    private Double bonus;
    @OneToOne(mappedBy = "salary")
    private Employee employee;

    private Double TotalSalary(double hra, double netSalary, double tdx, double bonus){
        return hra+netSalary+tdx+bonus;
    }
}
