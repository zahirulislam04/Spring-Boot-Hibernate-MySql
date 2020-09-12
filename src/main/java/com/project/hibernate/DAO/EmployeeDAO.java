package com.project.hibernate.DAO;

import java.util.List;

import com.project.hibernate.model.Employee;

public interface EmployeeDAO {
	List<Employee> get();
	Employee get(int id);
	void save(Employee employee);	
	void delete(int id);	
}
