package packagename_employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import packagename_employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
