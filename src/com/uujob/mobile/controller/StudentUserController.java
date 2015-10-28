package com.uujob.mobile.controller;

import javax.annotation.Resource;

import org.apache.http.message.BasicNameValuePair;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uujob.mobile.contants.Constants;
import com.uujob.mobile.controller.entity.StudentUser;
import com.uujob.mobile.controller.service.IStudentUserManager;

@Controller
public class StudentUserController {
	@Resource(name="studentUserManager")
	private IStudentUserManager studentUserManager;
	
	@RequestMapping("/api/login")
	@ResponseBody
	public int login(StudentUser studentUser){
		System.out.println(studentUser.getMailAddress());
		System.out.println(studentUser.getStudentPassword());
		int i = studentUserManager.Login(studentUser.getMailAddress(), studentUser.getStudentPassword());
		if(i==1){
			return Constants.LOGIN_SUCCESS;
		}else {
			return Constants.LOGIN_FAILED;
		}
		
	}
	@RequestMapping("/api/register")
	@ResponseBody
	public int register(StudentUser studentUser){
		System.out.println("register executed");
		int i = studentUserManager.Register(studentUser);
		if(i==0){
			System.out.println("数据库已经存在该条目");
			return Constants.MAIL_EXISTED;
		}else{
			System.out.println("成功添加该用户");
			return Constants.REGISTER_SUCCESS;
		}
		
		
	}

}
