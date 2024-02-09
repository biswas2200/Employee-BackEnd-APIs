package com.allmappings.employeebackendapis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeSalaryDto {
    private Integer salaryId;
    private Double hra;
    private Double netSalary;
    private Double tdx;
    private Double bonus;
    private Double totalSalary;
}
