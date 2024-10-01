package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beanfiles.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}

