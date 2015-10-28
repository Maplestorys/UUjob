package com.uujob.mobile.controller.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.uujob.mobile.controller.entity.StudentUser;

public class StudentUserDAO implements IStudentUserDAO{
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	@Override
	public void addStudentUser(StudentUser studentUseruser) {
		// TODO Auto-generated method stub
		System.out.println("student user dao executed");
		sessionFactory.getCurrentSession().save(studentUseruser);
		sessionFactory.getCurrentSession().flush();
		
	}

	@Override
	public boolean delStudentUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateStudentUser(String id,StudentUser user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		StudentUser studentUser = (StudentUser) session.get(StudentUser.class, id);
		studentUser.setMailAddress(user.getMailAddress());
		studentUser.setNickName(user.getNickName());
		studentUser.setStudentPassword(user.getStudentPassword());
		session.update(studentUser);
		session.getTransaction().commit();
		
	}

	@Override
	public StudentUser queryStudentUser(String mailAddress) {
		// TODO Auto-generated method stub
		String hql = "from StudentUser u where u.mailAddress=?";
		Query query =sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter(0, mailAddress);
		List<StudentUser> list = query.list();
		if(!list.isEmpty()){
			return list.get(0);
		}
		return null;
	}

}
