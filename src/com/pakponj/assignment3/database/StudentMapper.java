package com.pakponj.assignment3.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setAmbition(rs.getString("ambition"));
//		student.setAmbition(rs.getCharacterStream("ambition").toString());
		student.setGpax(rs.getFloat("gpax"));
		return student;
	}
}
