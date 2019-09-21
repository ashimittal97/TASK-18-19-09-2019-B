package com.worlday.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worlday.Dao.DaoInterface;
import com.worlday.Models.Student;

@Service
public class StudentServiceImp  implements StudentServices{

	
	@Autowired
	 private DaoInterface daoInterface;
	public void studentEntry(Student student) {
		daoInterface.addStudent(student);
		
	}

	public void deleteStudent(int code) {
		daoInterface.removeStudent(code);
		
	}

	public void changeStudentDetails(Student student) {
		daoInterface.updateStudent(student);
		
	}

	
	public Student searchStudent(int code) {
		
		return daoInterface.getStudentById(code);
	}

	public List<Student> viewAllStudents() {
		
		return daoInterface.getAllStudents();
	}

}
