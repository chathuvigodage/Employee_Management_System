package com.paymedia.employee_management_system.job;

import com.paymedia.employee_management_system.employee.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class Job {
    @Id
    private String id;
    private String title;

//    @OneToMany(mappedBy = "job")
//    private Set<Employee> employees;

    public Job() {
    }

    public Job(String id, String title) {
        this.id = id;
        this.title = title;
    }

    // Getters and setters
    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public Set<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(Set<Employee> employees) {
//        this.employees = employees;
//    }
}