package com.example.project_microservices.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project_microservices.entity.Project;
import com.example.project_microservices.repository.ProjectRepository;
import com.example.project_microservices.service.ProjectService;
@Service
public class ProjectServiceImpl implements ProjectService{
	 @Autowired
	    private ProjectRepository projectRepository;

	    @Override
	    public Project saveProject(Project project) {
	        return projectRepository.save(project);
	    }

	    @Override
	    public Project getProjectByCode(Long projectCode) {
	        return projectRepository.findByProjectCode(projectCode);
	    }

		@Override
		public Project getProjectByName(String projectName) {
			// TODO Auto-generated method stub
			return null;
		}

//	    @Override
//	    public Project getProjectByName(String projectName) {
//	        return projectRepository.findByProjectName(projectName);
//	    }
	}