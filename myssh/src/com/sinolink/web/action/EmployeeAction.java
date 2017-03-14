package com.sinolink.web.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.sinolink.domain.Department;
import com.sinolink.domain.Employee;
import com.sinolink.service.interfaces.DepartmentServiceInter;
import com.sinolink.service.interfaces.EmployeeServiceInter;
import com.sinolink.web.forms.AddEmployeeForm;
/**
 * 标题：新增职员action
 * 功能： 
 * 创建日期：2017年3月14日下午2:01:14
 * 类全名：com.sinolink.web.action.AddEmployeeAction
 * 作者：Mark
 */

public class EmployeeAction extends DispatchAction {
	//TODO 是否可以也使用@Resource
	private EmployeeServiceInter employeeService;
	private DepartmentServiceInter departService;

	public void setDepartService(DepartmentServiceInter departService) {
		this.departService = departService;
	}

	public void setEmployeeService(EmployeeServiceInter employeeService) {
		this.employeeService = employeeService;
	}
	
	// 跳转到新增职员页面
	public ActionForward goAddUi(ActionMapping arg0, ActionForm arg1, HttpServletRequest request, HttpServletResponse response) {
		AddEmployeeForm form = (AddEmployeeForm)arg1;
		System.out.println(form.toString());

		Employee emp = new Employee();
		emp.setName(form.getName());
		emp.setPwd(form.getPwd());
		emp.setEmail(form.getEmail());
		emp.setGrade(Integer.valueOf(form.getGrade()));
		emp.setHiredate(form.getHiredate());
		emp.setSalary(Float.valueOf(form.getSalary()));
		
		employeeService.addEmployee(emp);
		return arg0.findForward("ok");
	}
	
	// 新增职员
	public ActionForward saveEmployee(ActionMapping arg0, ActionForm arg1, HttpServletRequest request, HttpServletResponse response) {
		AddEmployeeForm form = (AddEmployeeForm)arg1;
		System.out.println(form.toString());
		
		Employee emp = new Employee();
		emp.setName(form.getName());
		emp.setPwd(form.getPwd());
		emp.setEmail(form.getEmail());
		emp.setGrade(Integer.valueOf(form.getGrade()));
		emp.setHiredate(form.getHiredate());
		emp.setSalary(Float.valueOf(form.getSalary()));
		System.out.println(form.toString());
		System.out.println(form.getDepartId());
		Department depart = departService.findDepartmentById(Integer.parseInt(form.getDepartId()));
		emp.setDepart(depart);
		try {
			employeeService.addEmployee(emp);
		} catch (Exception e) {
			e.printStackTrace();
			return arg0.findForward("err");
		}
		return arg0.findForward("ok");
	}
	
	

	// 显示所有职员
	public ActionForward findEmployee(ActionMapping arg0, ActionForm arg1, HttpServletRequest request, HttpServletResponse response) {
		List<Employee> lists = employeeService.findEmployee();
		if(lists != null && !lists.isEmpty()) {
			request.getSession().setAttribute("empLists", lists);
			return arg0.findForward("ok");
		} else {
			return arg0.findForward("err");
		}
	}
	

}
