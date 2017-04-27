package com.pakponj.assignment3.database;

public class Student {
	private String name;
	private Integer id;
	private Float gpax;
	public Float getGpax() {
		return gpax;
	}
	
	public void setGpax(Float gpax) {
		this.gpax = gpax;
	}
	
	private String ambition;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAmbition() {
		return ambition;
	}
	public void setAmbition(String ambition) {
		this.ambition = ambition;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpax=" + gpax + ", ambition=" + ambition + "]";
	}
	
}
