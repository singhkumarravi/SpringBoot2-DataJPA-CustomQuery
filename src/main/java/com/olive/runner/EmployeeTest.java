package com.olive.runner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepositiory;
@Component
public class EmployeeTest implements CommandLineRunner {
    @Autowired
	private EmployeeRepositiory repo;

	public void run(String... args) throws Exception {
		System.out.println("Application Started...................");
		
		repo.save(new Employee(10, "Ravi", 40.0, "Hyd"));
		repo.save(new Employee(20, "Manoj", 4044.0, "LKO"));
		repo.save(new Employee(30, "Sanoj", 404.0, "Hyd"));
		repo.save(new Employee(40, "Somesh", 440.0, "Ameerpet"));
		repo.save(new Employee(50, "Ajit", 403.0, "Hyd"));
		repo.save(new Employee(60, "Ramesh", 410.0, "lko"));
		repo.save(new Employee(70, "Ravi", 400.0, "Varanasi"));
		System.out.println("Fetching all Record******************");
		List<Employee> list = repo.getAllEmployee();
		list.forEach(System.out::println);
		System.out.println("Fetching All one column  Record********************");
		List<String> empName = repo.getEmpName();
		empName.forEach(System.out::println);
		
		System.out.println("*********Fetching Name And Sal*************");
	    List<Object[]> l1 = repo.getAllEmpNameAndSal();
		for(Object ob[]: l1) {
			System.out.println(ob[0] + ".............." +ob[1]);
		}
		
	/*
	 * fetching One Row Record Data
	 */
        String name = repo.getEmpNameById();
        System.out.println("Name :: " + name);
        
		Employee emp = repo.getOneEmpById();
		System.out.println(" Employee :: " + emp);
		                
	   Employee empByName = repo.getEmpByName();
	   System.out.println("Employee Serach by Name :: " + empByName);
	      
	   
	   }
	}
    

	


