package com.example.springdemo2.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.*;

@Controller
public class ProjectController {
	
	@RequestMapping("/new")
	public String displayProjectForm() {
		return "new-project";
	}

}
