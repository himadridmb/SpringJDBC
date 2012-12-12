package com.unoapp;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentHibernateTemplateDAO implements StudentDAO {
	
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentSP(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
