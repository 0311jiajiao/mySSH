package com.sinolink.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.sinolink.domain.Department;
import com.sinolink.domain.Employee;
import com.sinolink.service.interfaces.EmployeeServiceInter;

/**
 * @Title :接口实现
 * @Desc :
 * @Time : 2017年3月11日下午1:32:56
 * @Class : com.sinolink.service.impl.EmployeeServiceImpl.java
 * @Version : 1.0
 * @User : Y
 */
@Transactional
public class EmployeeServiceImpl implements EmployeeServiceInter {

	// 当我们给某个属性，增加了@Resource之后，那Spring就会启用byName的方式，注入属性值。
	@Resource
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Override
	public void addEmployee(Employee e) {
		/*
		 * //每个函数自定义事物 Session session = sessionFactory.openSession();
		 * Transaction ts = (Transaction) session.beginTransaction();
		 * session.save(e); try { ts.commit(); } catch (Exception e1) {
		 * e1.printStackTrace(); }
		 */
		try {
			sessionFactory.getCurrentSession().save(e);
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println("运行时异常...com.sinolink.service.impl.EmployeeServiceImpl.addEmployee(Employee)");
		}
	}

	@Override
	public List<Employee> findEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee findEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee checkEmployee(Employee emp) {
		String hpl = "from Employee where id=? and pwd=?";
		List<Employee> lists = sessionFactory.getCurrentSession().createQuery(hpl).setString(0, emp.getId() + "")
				.setString(1, emp.getPwd()).list();
		/*
		//显性初始化   解决懒加载问题，还有两种方法
		Hibernate.initialize(Department.class);//select 预先查询
		*/
		if (lists.size() == 1) {
			return lists.get(0);
		}
		return null;
	}

}
