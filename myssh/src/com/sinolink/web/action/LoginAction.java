package com.sinolink.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sinolink.domain.Employee;
import com.sinolink.service.interfaces.EmployeeServiceInter;
import com.sinolink.web.forms.EmployeeForm;

/**
 * @Title :
 * @Desc :
 * @Time : 2017年3月11日下午4:07:03
 * @Class : com.sinolink.web.action.LoginAction.java
 * @Version : 1.0
 * @User : Y
 */
public class LoginAction extends DispatchAction {
	// 响应登陆请求
	public ActionForward login(ActionMapping arg0, ActionForm arg1, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		EmployeeForm employeeForm = (EmployeeForm)arg1;
		String id = employeeForm.getId();
		String pwd = employeeForm.getPwd();
		System.out.println(" ***  "+id +" ---- "+ pwd);
		//获取Spring容器
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(this.getServlet().getServletContext());
		EmployeeServiceInter employeeServiceInter = (EmployeeServiceInter)wac.getBean("employeeServiceImpl");
		Employee e = new Employee();
		e.setId(Integer.valueOf(id));
		e.setPwd(pwd);
		e = employeeServiceInter.checkEmployee(e);

		if(e != null) {
			request.getSession().setAttribute("loginUser", e);
			return arg0.findForward("ok");
		} else {
			return arg0.findForward("err");
		}
	}

	// 响应登出请求
	public ActionForward loginOut(ActionMapping arg0, ActionForm arg1, HttpServletRequest arg2,
			HttpServletResponse arg3) throws Exception {
		return super.execute(arg0, arg1, arg2, arg3);
	}
}
