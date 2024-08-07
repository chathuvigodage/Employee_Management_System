package com.paymedia.employee_management_system.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        List<Job> jobs = new ArrayList<>();
        jobRepository.findAll().forEach(jobs::add);
        return jobs;
    }

    public Job getJob(String id) {
        return jobRepository.findById(id).orElse(null);
    }

    public void addJob(Job job) {
        jobRepository.save(job);
    }

    public void updateJob(String id, Job job) {
        jobRepository.save(job);
    }

    public void deleteJob(String id) {
        jobRepository.deleteById(id);
    }
}