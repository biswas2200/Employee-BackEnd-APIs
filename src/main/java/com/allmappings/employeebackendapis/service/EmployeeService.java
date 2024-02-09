package com.allmappings.employeebackendapis.service;

import com.allmappings.employeebackendapis.dto.EmployeeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<EmployeeDto> getAllEmployee();

    public EmployeeDto getEmployeeById(Long id);
    public EmployeeDto createEmployee(EmployeeDto employeeDto);
    public EmployeeDto updateEmployeeById(Long id, EmployeeDto employeeDto);
    public void deleteEmployeeById(Long id);
}
