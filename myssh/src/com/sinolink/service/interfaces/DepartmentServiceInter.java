package com.sinolink.service.interfaces;

import java.util.List;

import com.sinolink.domain.Department;

/**
 * @Title :部门接口
 * @Desc :
 * @Time : 2017年3月13日下午10:44:59
 * @Class : com.sinolink.service.interfaces.DepartmentServiceInter.java
 * @Version : 1.0
 * @User : Y
 */
public interface DepartmentServiceInter {
	
	public void addDepart(Department depart);

	public List<Department> findDepartment();

	public void deleteDepartment(Integer id);

	public void updateDepartment(Department depart);

	public Department findDepartmentById(Integer id);

}
