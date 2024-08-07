package com.paymedia.employee_management_system.employee;


import com.paymedia.employee_management_system.job.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/jobs/{jobId}/employees")
    public List<Employee> getAllEmployees(@PathVariable String jobId) {
        return employeeService.getAllEmployees(jobId);
    }

    @GetMapping("/jobs/employees/{id}")
    public Job getEmployee(@PathVariable String id) {
        return employeeService.getEmployee(id).getJob();
    }

    @PostMapping("/jobs/{jobId}/employees")
    public void addEmployee(@RequestBody Employee employee, @PathVariable String jobId) {
        employee.setJob(new Job(jobId, ""));
        employeeService.addEmployee(employee);
    }

    @PutMapping("/jobs/{jobId}/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee, @PathVariable String jobId, @PathVariable String id) {
        employee.setId(id);
        employee.setJob(new Job(jobId, ""));
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/jobs/{jobId}/employees/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }
}
