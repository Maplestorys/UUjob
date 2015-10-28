package com.uujob.mobile.controller.service;

import com.uujob.mobile.controller.entity.StudentUser;

public interface IStudentUserManager {
	/*登陆*/
	public int Login(String MaiiAddress,String Password);
	/*修改个人资料*/
	public int EditProfile(String id,StudentUser student);
	/*注册*/
	public int Register(StudentUser user);
}
