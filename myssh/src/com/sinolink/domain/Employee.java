package com.sinolink.domain;

import java.util.Date;

/**
 * @Title :雇员信息
 * @Desc :
 * @Time : 2017年3月9日下午11:08:06
 * @Class : com.sinolink.domain.Employee.java
 * @Version : 1.0
 * @User : Y
 */
public class Employee {
	private Integer id;
	private String name;
	private String email;
	private Date hiredate;
	private Float salary;

	public Employee() {
	}

	public Employee(String name, String email, Date hiredate, Float salary) {
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public Employee(Integer id, String name, String email, Date hiredate, Float salary) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.hiredate = hiredate;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", hiredate=" + hiredate + ", salary="
				+ salary + "]";
	}

}
