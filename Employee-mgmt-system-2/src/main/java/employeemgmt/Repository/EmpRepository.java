package employeemgmt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import employeemgmt.Entity.Employee;


@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
