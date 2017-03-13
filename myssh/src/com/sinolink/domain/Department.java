package com.sinolink.domain;

import java.util.Set;

/**
 * @Title :部门
 * @Desc :
 * @Time : 2017年3月13日下午10:09:27
 * @Class : com.sinolink.domain.Department.java
 * @Version : 1.0
 * @User : Y
 */
public class Department {
	private Integer id;
	private String name;
	private Set<Employee> emps;

	public Department() {
	}

	public Department(String name) {
		this.name = name;
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

	public Set<Employee> getEmps() {
		return emps;
	}

	public void setEmps(Set<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", emps=" + emps + "]";
	}

}
