package com.sinolink.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sinolink.domain.Employee;
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
		Employee emp = new Employee("HSddP", "pwd123", 11,"122267840@qq.com", new Date(), 125.5f);

//		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
//		Session session = sessionFactory.openSession();
//		Transaction ts = session.beginTransaction();
//		session.save(emp);
//		ts.commit();
		
		EmployeeServiceInter employeeService = (EmployeeServiceInter)ac.getBean("employeeServiceImpl");
		employeeService.addEmployee(emp);
	}
}
