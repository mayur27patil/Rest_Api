package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
	
	
	@Autowired
	private StudentService ss;
	
	@PostMapping(value ="/add")
	public Student m1(@RequestBody Student s)
	{
		return ss.insertStudent(s);
	}    //insert-post
	
	@GetMapping(value = "/findbyid/{sid}")
	public Student m2(@PathVariable("sid")int sid)
	{
		return ss.findStudentBySid(sid);
	} //get-display
	
	@GetMapping(value = "/findall")
	public List<Student> m3()
	{
		return ss.findAllStudent();
		
	}  //get-display-all
	
	@PutMapping(value ="/update")
	public Student m4(@RequestBody Student s)
	{
		return ss.insertStudent(s);
	}  //Update- put
	
	@DeleteMapping(value ="/delete/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
	   ss.deleteStudentById(id);
	}  // delete - delete 
	
}

