package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beanfiles.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

