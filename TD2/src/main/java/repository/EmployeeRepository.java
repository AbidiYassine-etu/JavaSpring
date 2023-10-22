package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
