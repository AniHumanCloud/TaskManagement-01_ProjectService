package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ProjectDto;
import com.example.dto.entity.ProjectEntity;
import com.example.service.ProjectService;

@RestController
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping("create-project")
	public ResponseEntity<ProjectEntity>createProject(@RequestBody ProjectDto projectDto){
		return new ResponseEntity<ProjectEntity>(projectService.createProjectAndUpdate(projectDto),HttpStatus.CREATED);
	}
}
