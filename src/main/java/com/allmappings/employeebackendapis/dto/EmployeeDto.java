package com.allmappings.employeebackendapis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private Integer employeeAge;
    private EmployeeDepartmentDto department;
    private EmployeeAddressDto address;

}
