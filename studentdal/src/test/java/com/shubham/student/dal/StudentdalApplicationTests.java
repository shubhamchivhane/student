package com.shubham.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.shubham.student.dal.entities.Student;
import com.shubham.student.dal.respos.StudentRepository;

@SpringBootTest
class StudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studRepository;

	@Test
	public void testAddStudent(){
		
		Student student = new Student();
		student.setName("shubham");
		student.setCourse("java");
		student.setFees(12345.00);
		
		studRepository.save(student);
		
	}
	
	@Test
	public void testGetStudent()
	{
		Student student=new Student();
		student.setId(1L);
	//	studRepository.findAll();
		System.out.println("--------------"+studRepository.findAll());
//		if(studOp.isPresent())
//		{
//			Student stud=studOp.get();
//			System.out.println("--------------");
//			System.out.println(stud);
//		}
		
	}

	@Test
	public void testUpdateStudent()
	{
		Student student=new Student();
		student.setId(1L);
	  Optional<Student> studen=studRepository.findById(1l);
	  System.out.println("--------------"+studRepository.findAll());
	if(studen.isPresent())
		{
			Student stud=studen.get();
			System.out.println("--------------"+stud );
	        stud.setFees(1234567.00);
			studRepository.save(stud);
		}
		
	}
	
}
