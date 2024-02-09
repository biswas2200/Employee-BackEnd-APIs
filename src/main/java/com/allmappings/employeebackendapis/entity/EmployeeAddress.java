package com.allmappings.employeebackendapis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeeAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empAddressId;
    @Column(name = "emp_area_street")
    private String areaStreet;
    @Column(name = "emp_city")
    private String city;
    @Column(name = "emp_state")
    private String state;
    @Column(name = "emp_country")
    private String country;

    @OneToOne(mappedBy = "address")
    private Employee employee;
}
