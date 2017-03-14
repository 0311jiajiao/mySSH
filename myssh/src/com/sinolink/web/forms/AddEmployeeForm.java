package com.sinolink.web.forms;

import java.util.Date;

import org.apache.struts.action.ActionForm;

/**
 * 标题： 功能： 创建日期：2017年3月14日下午12:07:09 类全名：com.sinolink.web.forms.AddEmployee
 * 作者：Mark
 */
public class AddEmployeeForm extends ActionForm {
	
	private static final long serialVersionUID = 21427886542226562L;
	private String name;
	private String pwd;
	private Integer grade;
	private String email;
	private Date hiredate;
	private Float salary;
	private String departId;
	
	public String getDepartId() {
		return departId;
	}

	public void setDepartId(String departId) {
		this.departId = departId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "AddEmployeeForm [name=" + name + ", pwd=" + pwd + ", grade=" + grade + ", email=" + email
				+ ", hiredate=" + hiredate + ", salary=" + salary + ", departId=" + departId + "]";
	}

}
