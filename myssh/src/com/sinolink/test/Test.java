package com.sinolink.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinolink.domain.Department;
import com.sinolink.domain.Employee;
import com.sinolink.service.impl.DepartmentServiceImpl;
import com.sinolink.service.interfaces.EmployeeServiceInter;

/**
 * @Title :
 * @Desc :
 * @Time : 2017年3月9日下午10:28:23
 * @Class : com.sinolink.test.Test.java
 * @Version : 1.0
 * @User : Y
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		TestService test = (TestService) ac.getBean("testService");
		System.out.println(test.getName());
		Employee emp1 = new Employee("韩顺平1", "111", 1,"122267840@qq.com", new Date(), 125.5f);
		Employee emp2 = new Employee("韩顺平2", "222", 1,"122267840@qq.com", new Date(), 125.5f);
		Employee emp3 = new Employee("韩顺平3", "333", 1,"122267840@qq.com", new Date(), 125.5f);

		Department depart = new Department("财务部");
		Set<Employee> sets = new HashSet<Employee>();
		sets.add(emp1);
		sets.add(emp2);
		sets.add(emp3);
		
		depart.setEmps(sets);
		
//		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
//		Session session = sessionFactory.openSession();
//		Transaction ts = session.beginTransaction();
//		session.save(emp);
//		ts.commit();
		/*
		//保存雇员信息*/
		EmployeeServiceInter employeeService = (EmployeeServiceInter)ac.getBean("employeeServiceImpl");
		employeeService.addEmployee(emp1);
		employeeService.addEmployee(emp2);
		employeeService.addEmployee(emp3);
		
		DepartmentServiceImpl departmentService = (DepartmentServiceImpl)ac.getBean("departmentServiceImpl");
		departmentService.addDepart(depart);
		
	}
}
