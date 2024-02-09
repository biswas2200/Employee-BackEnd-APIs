package com.allmappings.employeebackendapis.service.impl;

import com.allmappings.employeebackendapis.dto.EmployeeAddressDto;
import com.allmappings.employeebackendapis.dto.EmployeeDto;
import com.allmappings.employeebackendapis.entity.Employee;
import com.allmappings.employeebackendapis.entity.EmployeeAddress;
import com.allmappings.employeebackendapis.repository.EmployeeAddressRepository;
import com.allmappings.employeebackendapis.repository.EmployeeRepository;
import com.allmappings.employeebackendapis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    EmployeeAddressRepository employeeAddressRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository,
                               EmployeeAddressRepository employeeAddressRepository){
        this.employeeRepository = employeeRepository;
        this.employeeAddressRepository = employeeAddressRepository;
    }
    public EmployeeDto mapToDto(Employee employee){
        if (employee == null) return null;
        EmployeeDto dto = new EmployeeDto();
        dto.setEmployeeId(employee.getEmployeeId());
        dto.setEmployeeFirstName(employee.getEmployeeFirstName());
        dto.setEmployeeLastName(employee.getEmployeeLastName());
        dto.setEmployeeAge(employee.getEmployeeAge());

        EmployeeAddress address = employee.getAddress();
        if (address != null) {
            EmployeeAddressDto addressDto = new EmployeeAddressDto();
            addressDto.setAreaStreet(address.getAreaStreet());
            addressDto.setCity(address.getCity());
            addressDto.setState(address.getState());
            addressDto.setCountry(address.getCountry());
            dto.setAddress(addressDto);
        }

        return dto;
    }

    public Employee maptoEntity(EmployeeDto dto){
        if (dto == null) return null;
        Employee employee = new Employee();
        employee.setEmployeeId(dto.getEmployeeId());
        employee.setEmployeeFirstName(dto.getEmployeeFirstName());
        employee.setEmployeeLastName(dto.getEmployeeLastName());
        employee.setEmployeeAge(dto.getEmployeeAge());

        EmployeeAddressDto addressDto = dto.getAddress();
        if (addressDto != null) {
            EmployeeAddress address = new EmployeeAddress();
            address.setAreaStreet(addressDto.getAreaStreet());
            address.setCity(addressDto.getCity());
            address.setState(addressDto.getState());
            address.setCountry(addressDto.getCountry());
            employee.setAddress(address);
        }

        return employee;
    }

    @Override
    public List<EmployeeDto> getAllEmployee(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElse(null);
        return mapToDto(employee);
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = maptoEntity(employeeDto);
        employee = employeeRepository.save(employee);
        return mapToDto(employee);
    }

    @Override
    public EmployeeDto updateEmployeeById(Long id, EmployeeDto employeeDto) {
        return null;
    }

    @Override
    public void deleteEmployeeById(Long id) {

    }
}
