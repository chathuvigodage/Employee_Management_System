package com.paymedia.employee_management_system.employee;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
    List<Employee> findByJobId(String jobId);
}
