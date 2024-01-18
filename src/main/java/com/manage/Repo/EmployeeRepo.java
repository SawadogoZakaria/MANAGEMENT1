package com.manage.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.manage.Entity.Employee;

@EnableJpaRepositories
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
