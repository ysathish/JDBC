package com.nt.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component @Scope("prototype")
public class Student 
{
	private int Id;
	private String name;
	private int marks;
	
	public int getId()
	{
		return Id;
	}
	public void setId(int id) 
	{
		Id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getMarks() 
	{
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
