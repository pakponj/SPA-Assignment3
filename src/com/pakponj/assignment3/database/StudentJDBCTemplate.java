package com.pakponj.assignment3.database;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void create(String name, Float gpax, String ambition) {
		String SQL = "insert into Student (name, gpax, ambition) values (?, ?, ?)";
		jdbcTemplateObject.update( SQL, name, gpax, ambition);
		System.out.println("Created Record Name = " + name + " GPAX = " + gpax + " Ambition = " + ambition);
		return;
	}
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL,
				new Object[]{id}, new StudentMapper());
		return student;
	}
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List <Student> students = jdbcTemplateObject.query(SQL,
				new StudentMapper());
		return students;
	}
	public void delete(Integer id){
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}
	public void update(Integer id, String name, Float gpax, String ambition ){
		String SQL = "update Student set name = ?, gpax = ?, ambition = ? where id = ?";
		jdbcTemplateObject.update(SQL, name, gpax, ambition, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}
}