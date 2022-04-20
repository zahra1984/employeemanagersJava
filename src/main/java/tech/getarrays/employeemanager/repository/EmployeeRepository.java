package tech.getarrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
