package com.sinolink.service.interfaces;

import java.util.List;

import com.sinolink.domain.Employee;

/**
 * @Title :Service 接口
 * @Desc :
 * @Time : 2017年3月11日下午1:28:48
 * @Class : com.sinolink.service.interfaces.EmployeeServiceInter.java
 * @Version : 1.0
 * @User : Y
 */
public interface EmployeeServiceInter {
	
	public void addEmployee(Employee e);

	public List<Employee> findEmployee();

	public boolean deleteEmployee(Integer id);

	public void updateEmployee(Employee e);

	public Employee findEmployeeById(Integer id);
}
