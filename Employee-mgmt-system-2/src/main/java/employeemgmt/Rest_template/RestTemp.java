package employeemgmt.Rest_template;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import employeemgmt.Entity.Employee;
@Component
public class RestTemp {

	private static final String GET_ALL="http://localhost:8090/employee/getAll";
	@Autowired
	private RestTemplate restTemplate;

	public List<Employee> getEmployee()
	{
	Employee[] objects = restTemplate.getForObject(GET_ALL, Employee[].class);
	return Arrays.asList(objects);
	}
}
