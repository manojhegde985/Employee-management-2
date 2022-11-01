package employeemgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import employeemgmt.Entity.Employee;
import employeemgmt.Rest_template.RestTemp;



@Service
public class EmpService implements IEmployeService {

	@Autowired
	private RestTemp restTemplate;
	
	@Override
	public List<Employee> getAll() {
		return restTemplate.getEmployee();
	}
	
}
