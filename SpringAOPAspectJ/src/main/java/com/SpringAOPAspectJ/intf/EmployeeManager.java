package com.SpringAOPAspectJ.intf;

import java.util.List;

import com.SpringAOPAspectJ.dto.EmployeeDTO;

public interface EmployeeManager 
{
	public EmployeeDTO getEmployeeById(Integer employeeId);
	public List<EmployeeDTO> getAllEmployee();
	public void createEmployee(EmployeeDTO employee);
	public void deleteEmployee(Integer employeeId);
	public void updateEmployee(EmployeeDTO employee);

}
