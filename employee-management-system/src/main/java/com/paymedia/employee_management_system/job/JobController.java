package com.paymedia.employee_management_system.job;

import com.paymedia.employee_management_system.employee.Employee;
import com.paymedia.employee_management_system.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class JobController {
    @Autowired
    private JobService jobService;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobs/{id}")
    public Job getJob(@PathVariable String id) {
        return jobService.getJob(id);
    }

//    @GetMapping("jobs/{id}/employees")
//    public List<Employee> getEmployeesByJob(@PathVariable String id) {
//        Job job = jobService.getJob(id);
//        if (job != null) {
//            return job.getEmployees().stream().toList();
//        }
//        return List.of();
//    }

    @PostMapping("/jobs")
    public void addJob(@RequestBody Job job) {
        jobService.addJob(job);
    }

    @PutMapping("jobs/{id}")
    public void updateJob(@RequestBody Job job, @PathVariable String id) {
        jobService.updateJob(id, job);
    }

    @DeleteMapping("jobs/{id}")
    public void deleteJob(@PathVariable String id) {
        jobService.deleteJob(id);
    }
}
