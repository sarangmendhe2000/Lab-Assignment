package com.demo.MySpringbootRestWebService.DtoMapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.MySpringbootRestWebService.Bean.Student;
import com.demo.MySpringbootRestWebService.Dto.StudentDto;

public class StudentDtoMapper {
	
	public static Student mapToStudent(StudentDto s)
	{
		if(s.getLdtstr()==null)
		{
			return new Student(s.getSid(), s.getName() , s.getAddress() , s.getEmail() , null);
		}
		else
		{
		return new Student(s.getSid(), s.getName() , s.getAddress() , s.getEmail() , LocalDate.parse(s.getLdtstr() , DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
	
	public static StudentDto mapToStudentDto(Student s)
	{
		if(s.getDob() == null)
		{
			return new StudentDto(s.getSid(), s.getName() , s.getAddress() , s.getEmail() , null);
		}
		else
		{
			return new StudentDto(s.getSid(), s.getName() , s.getAddress() , s.getEmail(), s.getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
	
	
}
