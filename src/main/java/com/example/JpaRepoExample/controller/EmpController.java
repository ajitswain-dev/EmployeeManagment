package com.example.JpaRepoExample.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaRepoExample.model.Employee;
import com.example.JpaRepoExample.repository.EmployerRepository;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmployerRepository employerRepository;
	
	@GetMapping(value="/all")
	public List<Employee> getAllEmp()
	{
		return (List<Employee>) employerRepository.findAll();
	}
	@GetMapping(value="/test/{name}")	
	public String test(@PathVariable String name)
	{
		return "Testing for mapping"+name;
	}
	@PostMapping(value="/load",consumes="application/json")
	public String saveEmp(@RequestBody final Employee emp)
	{
		try {
		employerRepository.save(emp);
		}
		catch(Exception ex)
		{
			return ex.getCause().toString();
		}
		return null;
	}
	@GetMapping("/id/{id}")
	public Optional<Employee> getEmpById(@PathVariable Long id)
	{
		return employerRepository.findById(id);
	}
}
