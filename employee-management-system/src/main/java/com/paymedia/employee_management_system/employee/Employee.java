package com.paymedia.employee_management_system.employee;

import com.paymedia.employee_management_system.job.Job;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;

    @ManyToOne
    private Job job;

    public Employee() {
    }

    public Employee(String id, String name, String email, String jobId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.job = new Job(jobId,"");
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}


