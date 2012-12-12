package com.unoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentSimpleJDBCTemplate implements StudentDAO {

	private NamedParameterJdbcTemplate jdbcTemplateObject;
	
	public NamedParameterJdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}

	public void setJdbcTemplateObject(NamedParameterJdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	@Override
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (:name, :age)";
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		params.put("age", age);
		jdbcTemplateObject.update(SQL, params);
		return;
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		Student student = jdbcTemplateObject.queryForObject(SQL,params, new StudentMapper());
		return student;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		Map<String, Object> params = new HashMap<String, Object>();
		List<Student> students = jdbcTemplateObject.query(SQL,params,new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Student where id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		jdbcTemplateObject.update(SQL, params);
		System.out.println("Deleted Record with ID = " + id);
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = :age where id = :id";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id", id);
		params.put("age", age);
		jdbcTemplateObject.update(SQL,params);
		System.out.println("Updated Record with ID = " + id);
		
	}

	@Override
	public Student getStudentSP(Integer id) {
		return null;
	}


}
