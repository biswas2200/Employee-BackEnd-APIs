package com.allmappings.employeebackendapis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeAddressDto {
    private Integer empAddressId;
    private String areaStreet;
    private String city;
    private String state;
    private String country;
}
