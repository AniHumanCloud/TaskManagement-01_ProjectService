package com.example.service;

import java.util.List;

import com.example.dto.ProjectDto;
import com.example.dto.entity.ProjectEntity;

public interface ProjectService {
	
	public ProjectEntity createProjectAndUpdate(ProjectDto projectDetails);
	
	public ProjectEntity getProjectById(Long ind);
	
	public List<ProjectEntity>getAllProjectEntities();

}
