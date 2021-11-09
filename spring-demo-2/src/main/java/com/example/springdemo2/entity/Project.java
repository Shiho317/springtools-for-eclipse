package com.example.springdemo2.entity;

import javax.persistence.GenerationType;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long projectId;
	private String name;
	private String stage;
	private String description;
	
	public Project() {
			

}
	
	public Project(String name, String stage, String description) {
		super();
		this.name = name;
		this.stage = stage;
		this.description = description;
	}
}
