package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
@Value("${val.name}")
private String newnameString;
	@GetMapping("/gtg")
	public String homepage() {
		return newnameString+" to student list";
	}
	@GetMapping("/list")
	public List<Student>getList(){
		List<Student>detailsList=new ArrayList<>();
		detailsList.add(new Student(1,"Mink",17));
		detailsList.add(new Student(2,"Lynn",18));
		detailsList.add(new Student(3,"Lascrea",19));
		return detailsList;
	}
}
