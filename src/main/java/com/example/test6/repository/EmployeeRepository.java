package com.example.test6.repository;

import com.example.test6.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    Page<Employee> findByFullNameContainingIgnoreCase(String fullName, Pageable pageable);

    Page<Employee> findByAgeBetweenAndBasicSalaryBetween(
            Integer minAge,
            Integer maxAge,
            Double minSalary,
            Double maxSalary,
            Pageable pageable
    );
}
