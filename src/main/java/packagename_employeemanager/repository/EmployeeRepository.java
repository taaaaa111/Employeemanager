package packagename_employeemanager.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import packagename_employeemanager.model.Employee;
import packagename_employeemanager.service.EmployeeService;

import java.util.UUID;

@Service
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addemployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
    }
}
