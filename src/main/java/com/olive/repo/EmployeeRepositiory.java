package com.olive.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.olive.model.Employee;

public interface EmployeeRepositiory extends JpaRepository<Employee, Integer>{
	@Query("select e from com.olive.model.Employee e")	
	//@Query("from Employee e")	
	List<Employee> getAllEmployee();
	
	@Query("select e.empName from com.olive.model.Employee e")
	List<String> getEmpName();
	
	@Query("select e.empName,e.empSal from com.olive.model.Employee e")
	List<Object []> getAllEmpNameAndSal();  
	
	//-----------------Get One Row Data-----------------------------------
	  @Query("select e.empName from com.olive.model.Employee e where e.empId=10")   
      String  getEmpNameById();
	  
	  @Query("select e from com.olive.model.Employee e where e.empId=10")  
	  Employee getOneEmpById();
	  
	  @Query("select e from com.olive.model.Employee e where e.empName='Manoj' ")
	  Employee getEmpByName();
	  
	  @Query("select e.empSal,e.empName from com.olive.model.Employee e where e.empName='Ravi' ")
	  Object getEmpByNameAndSal();
      
}
