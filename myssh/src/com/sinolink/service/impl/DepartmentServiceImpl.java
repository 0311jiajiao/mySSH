package com.sinolink.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.sinolink.domain.Department;
import com.sinolink.service.interfaces.DepartmentServiceInter;
/**
 * @Title :部门接口实现类
 * @Desc :
 * @Time : 2017年3月13日下午10:48:19
 * @Class : com.sinolink.service.impl.DepartmentServiceImpl.java
 * @Version : 1.0
 * @User : Y
 */
@Transactional
public class DepartmentServiceImpl implements DepartmentServiceInter {

	// 当我们给某个属性，增加了@Resource之后，那Spring就会启用byName的方式，注入属性值。
	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addDepart(Department depart) {
		sessionFactory.getCurrentSession().save(depart);
	}

	@Override
	public List<Department> findDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDepartment(Department depart) {
		// TODO Auto-generated method stub

	}

	@Override
	public Department findDepartmentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
