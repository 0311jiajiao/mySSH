package com.sinolink.web.forms;

import org.apache.struts.action.ActionForm;

/**
 * @Title :
 * @Desc :
 * @Time : 2017年3月11日下午4:27:04
 * @Class : com.sinolink.web.forms.EmployeeForm.java
 * @Version : 1.0
 * @User : Y
 */
public class EmployeeForm extends ActionForm {
	private static final long serialVersionUID = 3071007679255380261L;
	private String pwd;
	private String id;

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeForm [pwd=" + pwd + ", id=" + id + "]";
	}

}
