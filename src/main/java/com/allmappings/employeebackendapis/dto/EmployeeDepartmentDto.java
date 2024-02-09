package com.allmappings.employeebackendapis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartmentDto {
    private Integer deptId;
    private String deptName;
    private String role;
    private List<EmployeeDto> employeeList;
}
