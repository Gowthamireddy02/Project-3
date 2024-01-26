package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	@Autowired
	 private StudentRepository studentRepo;
	 
	 @Test
	 void saveStudent() {
		 Student s = new Student();
		 s.setName("Gowthami");
		 s.setCity("Bangalore");
		 s.setFee(1000);
		 
		 studentRepo.save(s);
		 
	 }
	 @Test
	 void deleteStudent() {
		 studentRepo.deleteById(2L);
		 
	 }
	 
	 @Test
	 void updateStudent() {
		 Student s= new Student();
		 s.setId(11L);
		 s.setName("Gowthami");
		 s.setCity("Bangalore");
		 s.setFee(2000);
		 
		 studentRepo.save(s);
		 
	 }
	 @Test
	 void allStudent() {
		 Iterable<Student> findAll = studentRepo.findAll();
		 for(Student student : findAll) {
			 System.out.println(student.getId());
			 System.out.println(student.getFee());
			 System.out.println(student.getCity());
			 System.out.println(student.getFee());
		 }
	 }
	 @Test
	 void findStudentById() {
		 Optional<Student> findById = studentRepo.findById(11L);
		         Student student = findById.get();
		         System.out.println(student.getId());
		         System.out.println(student.getName());
		         System.out.println(student.getCity());
		         System.out.println(student.getFee());
		 
	 }
	 
	 @Test
	 void  existStudent() {
		 boolean val = studentRepo.existsById(2L);
		 System.out.println(val);
	 }
		 
		 
	 }



