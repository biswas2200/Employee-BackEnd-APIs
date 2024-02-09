package com.allmappings.employeebackendapis.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_jpa")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column(name = "emp_firstName")
    private String employeeFirstName;
    @Column(name = "emp_lastName")
    private String employeeLastName;
    @Column(name = "empAge")
    private Integer employeeAge;
    @Column(name = "emp_Email")
    private String employeeEmail;
    @Column(name = "emp_phoneNum")
    private Integer employeePhNumber;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private EmployeeDepartment department;

    @OneToOne
    @JoinColumn(name = "address_id")
    private EmployeeAddress address;

    @OneToOne
    @JoinColumn(name = "salary_id")
    private EmployeeSalary salary;

}
