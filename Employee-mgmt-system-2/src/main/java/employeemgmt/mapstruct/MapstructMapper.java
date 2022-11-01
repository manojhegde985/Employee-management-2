package employeemgmt.mapstruct;


import java.util.List;

import org.mapstruct.Mapper;

import employeemgmt.Entity.Employee;

@Mapper(componentModel="spring")
public interface MapstructMapper {

	List<Employee> employeeToEmployeeList(List<Employee> list);
}


