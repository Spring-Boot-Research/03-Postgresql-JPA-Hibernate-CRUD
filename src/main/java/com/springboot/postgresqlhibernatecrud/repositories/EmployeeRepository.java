package com.springboot.postgresqlhibernatecrud.repositories;

import com.springboot.postgresqlhibernatecrud.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
