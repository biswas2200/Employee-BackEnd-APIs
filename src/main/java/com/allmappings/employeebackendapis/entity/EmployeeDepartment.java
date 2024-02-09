package com.allmappings.employeebackendapis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
    private Integer deptId;
    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "role")
    private String role;

    @OneToMany(mappedBy = "department")
    List<Employee> employeeList;
}
