package ashokit.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

public interface EmpRepositary extends JpaRepository<Employee, Integer> {

}
