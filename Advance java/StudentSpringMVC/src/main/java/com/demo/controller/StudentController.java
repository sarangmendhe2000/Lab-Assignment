package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.MyUser;
import com.demo.bean.Student;
import com.demo.service.StudService;

@Controller
@RequestMapping("/showStudent")
public class StudentController {
		
	@Autowired
	StudService sservice;
	
	@GetMapping("/student")
	public ModelAndView getAllStudent(HttpSession session)
	{
		Student user = (Student)session.getAttribute("stud");
		if(user != null)
		{
			List<Student>slist= sservice.showStudent();
			return new ModelAndView ("student" , "slist" , slist);
		}
		else
		{
			return new ModelAndView("loginpage" , "message" , "Please Enter Credentials ! " );
		}
		
		
		
	}
	
	
	@GetMapping("/addStudent")
	public String AddStudent(Model model)
	{
		model.addAttribute("s1" , new Student());
		return "insertdata";
	}
}
