package com.SpringAOPAspectJ.intf;

import java.util.ArrayList;
import java.util.List;

import com.SpringAOPAspectJ.dto.EmployeeDTO;

public class EmployeeManagerImpl implements EmployeeManager
{

	public EmployeeDTO getEmployeeById(Integer employeeId) {
		// TODO Auto-generated method stub
		System.out.println("Method getEmployeeById() called");
	    return new EmployeeDTO();
		
	}

	public List<EmployeeDTO> getAllEmployee() {
		// TODO Auto-generated method stub
		 System.out.println("Method getAllEmployee() called");
		 return new ArrayList<EmployeeDTO>();
	}

	public void createEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		System.out.println("Method createEmployee() called");
	}

	public void deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		 System.out.println("Method deleteEmployee() called");
	}

	public void updateEmployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		System.out.println("Method updateEmployee() called");
	}

}
