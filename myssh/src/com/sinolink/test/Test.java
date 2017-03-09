package com.sinolink.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		TestService test = (TestService)ac.getBean("testService");
		System.out.println(test.getName());
	}
}
