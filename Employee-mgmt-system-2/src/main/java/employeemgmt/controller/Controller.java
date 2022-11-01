package employeemgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import employeemgmt.Entity.Employee;
import employeemgmt.service.EmpService;

@RestController
@RequestMapping(value = "/rest")
public class Controller {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EmpService service;
	
	@GetMapping("/getAllRest")
	public ResponseEntity<List<Employee>> getAll()
    {
    List<Employee> allEmployees = service.getAll();
    return new ResponseEntity<List<Employee>>(allEmployees , HttpStatus.OK);
    }
}
