package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentDao sd;
	
	public Student insertStudent(Student s)
	{
		return sd.save(s);
		
	}
	
	public Student findStudentBySid(int sid)
	{
		return sd.findBySid(sid);
	}
	
	public List<Student> findAllStudent()
	{
		return sd.findAll();
	}
	public void deleteStudentById(int id) {
		   sd.deleteById(id);
		}
	
}
  
