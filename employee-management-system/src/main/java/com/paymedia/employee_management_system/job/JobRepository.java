package com.paymedia.employee_management_system.job;

import com.paymedia.employee_management_system.employee.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepository extends CrudRepository<Job, String> {

}
