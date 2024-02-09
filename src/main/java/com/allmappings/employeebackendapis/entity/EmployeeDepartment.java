package com.allmappings.employeebackendapis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deptId;
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "department")
    List<Employee> employeeList;
}
