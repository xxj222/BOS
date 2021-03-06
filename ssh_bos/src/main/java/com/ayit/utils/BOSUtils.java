package com.ayit.utils;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.ayit.beans.User;

public class BOSUtils {

	/*
	 * 获取session对象
	 * 
	 */
	public static HttpSession getSession(){
		
		return ServletActionContext.getRequest().getSession();
		
	}
	/*
	 * 获取session中的user对象
	 */
	//获取登录用户对象
	public static User getLoginUser(){
		return (User) getSession().getAttribute("user");
	}
}
