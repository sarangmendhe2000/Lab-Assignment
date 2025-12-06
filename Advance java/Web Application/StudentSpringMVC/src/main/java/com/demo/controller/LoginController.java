package com.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.bean.Student;
import com.demo.service.StudentService;

@Controller
@RequestMapping("/login")
public class LoginController {
       
	
	@Autowired
	StudentService sservice;
	
	
   @GetMapping("/loginuser")
   public String login() {

	   
	   return "loginpage";
}
   @PostMapping("/validate")
   public ModelAndView validate(HttpSession session , @RequestParam("uname") String uname,@RequestParam("pass")  String pass) {
      
	  Student stud=sservice.validateUser(uname,pass);
	  
	  if(stud!=null) 
	  {
	    session.setAttribute("stud",stud);
	    return new ModelAndView("redirect:/showStudent/student");
	   
   }
	  else
	  {
		  return new ModelAndView("loginpage" , "message" , "Invalid Credential ! ");
	  }
   
}

}