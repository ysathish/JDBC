package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.model.Student;
import com.nt.service.StudentService;

@SpringBootApplication
public class JdbcApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context=SpringApplication.run(JdbcApplication.class, args);
		Student s=context.getBean(Student.class);
		s.setId(2);
		s.setName("shiva");
		s.setMarks(89);
		StudentService service=context.getBean(StudentService.class);
		service.addStudent(s);
		List<Student> student=service.getStudents();
		System.out.println(student);
		
		
	}

}
