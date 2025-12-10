package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dto.Studentdto;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService sservice;

	@GetMapping("/showStudent")
	public ResponseEntity<List<Studentdto>> getAllStudent() {
		List<Studentdto> slist = sservice.findAllStudent();
		return ResponseEntity.ok(slist);
	}

	@GetMapping("/findStudent/{sid}")
	public ResponseEntity<Studentdto> getByid(@PathVariable int sid) {
		Studentdto obj = sservice.getById(sid);
		return ResponseEntity.ok(obj);

	}

	@PostMapping("/addStudent")
	public ResponseEntity<String> addStudent(@RequestBody Studentdto s) {
		boolean status = sservice.addStudent(s);
		if (status) {
			return ResponseEntity.ok("Student added");
		} else {
			return ResponseEntity.ok("Student not added");
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Studentdto s)

	{
			System.out.println("In controller s = "+s);
		boolean status = sservice.updateStudent(s);
		if (status) {
			return ResponseEntity.ok("Updated Succcessfully");
		} else {
			return ResponseEntity.ok(" not Updated");
		}
	}

	@DeleteMapping("/delete/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable int sid) {
		boolean status = sservice.deletestudent(sid);
		if (status) {
			return ResponseEntity.ok("Deleted successfully");
		} else {
			return ResponseEntity.ok("not deleted");
		}
	}

}
