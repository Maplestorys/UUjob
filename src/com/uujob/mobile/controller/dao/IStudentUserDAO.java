package com.uujob.mobile.controller.dao;

import com.uujob.mobile.controller.entity.StudentUser;

public interface IStudentUserDAO {
	/*向数据库写入新用户*/
	public void addStudentUser(StudentUser user);
	/*删除用户（未使用）*/
	public boolean delStudentUser(String id);
	/*修改用户条目*/
	public void updateStudentUser(String id,StudentUser user);
	/*查询用户*/
	public StudentUser queryStudentUser(String mailAddress); 
}
