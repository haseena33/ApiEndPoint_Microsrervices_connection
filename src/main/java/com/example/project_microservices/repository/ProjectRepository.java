package com.example.project_microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project_microservices.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findByProjectCode(long projectCode);
}
