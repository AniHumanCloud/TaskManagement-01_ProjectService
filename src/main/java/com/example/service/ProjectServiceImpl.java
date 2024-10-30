package com.example.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.dto.ProjectDto;
import com.example.dto.entity.ProjectEntity;
import com.example.repository.ProjectRepository;
@Service
public class ProjectServiceImpl implements ProjectService {

	private ProjectRepository projectRepository;
	@Override
	public ProjectEntity createProjectAndUpdate(ProjectDto projectDetails) {
		ProjectEntity project=new ProjectEntity();
		BeanUtils.copyProperties(projectDetails, project);
		return projectRepository.save(project);
	}

	@Override
	public ProjectEntity getProjectById(Long ind) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProjectEntity> getAllProjectEntities() {
		// TODO Auto-generated method stub
		return null;
	}

}
