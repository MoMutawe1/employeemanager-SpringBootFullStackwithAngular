package com.SpringBootWithAngular.employeemanager.repo;

import com.SpringBootWithAngular.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
