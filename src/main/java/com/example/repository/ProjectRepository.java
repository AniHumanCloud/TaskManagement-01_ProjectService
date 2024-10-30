package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dto.entity.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {

	
}
