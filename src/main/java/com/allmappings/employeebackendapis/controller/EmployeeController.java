package com.allmappings.employeebackendapis.controller;


import com.allmappings.employeebackendapis.dto.EmployeeDto;
import com.allmappings.employeebackendapis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get{id}")
    public ResponseEntity<EmployeeDto> getAllEmployee(@PathVariable Long id){
        EmployeeDto dto = employeeService.getEmployeeById(id);
        return new ResponseEntity<>(dto,HttpStatus.FOUND);
    }

    @GetMapping("/get")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDto = employeeService.getAllEmployee();
        return new ResponseEntity<>(employeeDto,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto dto = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}
