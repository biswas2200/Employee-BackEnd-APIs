package com.allmappings.employeebackendapis.repository;

import com.allmappings.employeebackendapis.entity.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress, Integer> {
}
