package com.example.project_microservices.service;

import com.example.project_microservices.entity.Project;

public interface ProjectService {
	 Project saveProject(Project project);
	    Project getProjectByCode(Long projectCode);
	    Project getProjectByName(String projectName); // New method
	}