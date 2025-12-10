package com.demo.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.beans.Student;
import com.demo.dto.Studentdto;

public class StudentDtoMapper {
	
	public static Student mapToStudent(Studentdto s)
	{
		
		if(s.getLdtstr()==null)
		{
			return new Student(s.getSid() , s.getSname() , s.getAddress(), s.getEmail() , null  );
		}
		else
		{
		
		return new Student(s.getSid(), s.getSname() , s.getAddress() , s.getEmail() , LocalDate.parse(s.getLdtstr(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
		}
	
	public static Studentdto mapToStudentDto(Student s)
	{
		if(s.getDob()==null)
		{
			return new Studentdto(s.getSid() , s.getSname() , s.getAddress(), s.getEmail() , null  );
		}
		else
		{
			return new Studentdto(s.getSid() , s.getSname() , s.getAddress(), s.getEmail() , s.getDob().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))  );
		}
	}
	
	
}
