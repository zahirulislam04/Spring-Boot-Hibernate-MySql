package com.project.hibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.hibernate.DAO.EmployeeDAOImpl;
import com.project.hibernate.model.Employee;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAOImpl repo;
		
	@Override
	public List<Employee> get() {
		return repo.get();
	}

	
	@Override
	public Employee get(int id) {
		return repo.get(id);
	}

	@Override
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	@Override
	public void delete(int id) {
		repo.delete(id);
	}

}
