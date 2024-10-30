package com.example.dto.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;

@Entity
@Data
public class ProjectEntity {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	 private Long projectId;
	 private String projectName;
	 private String proejctDescription;
	 @CreationTimestamp
	 @JoinColumn(name = "created_date",updatable = false)
	 private LocalDateTime createdDate;
	 @UpdateTimestamp
	 @JoinColumn(name="updated_Date",insertable = false)
	 private LocalDateTime updatedDate;
}
