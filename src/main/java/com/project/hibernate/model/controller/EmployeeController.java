package com.project.hibernate.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hibernate.model.Employee;
import com.project.hibernate.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping()
	public List<Employee> getEmployees(){
		return service.get();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable(name="id") int id){
		return service.get(id);
	}
	
	@PostMapping()
	public void saveEmployee(@RequestBody Employee employee) {
		service.save(employee);
	}
	
	@PutMapping()
	public void updateEmployee(@RequestBody Employee employee) {
		service.save(employee);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable(name = "id") int id) {		
		service.delete(id);
	}
}
