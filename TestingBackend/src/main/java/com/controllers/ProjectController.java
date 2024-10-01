package com.controllers;

import com.beanfiles.Project;
import com.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/projects/{id}")
    public Optional<Project> getProjectById(@PathVariable int id) {
        return projectService.getProjectById(id);
    }

    @PostMapping("/projects")
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }

    @PutMapping("/projects/{id}")
    public Project updateProject(@PathVariable int id, @RequestBody Project project) {
        project.setId(id);
        return projectService.saveProject(project);
    }

    @DeleteMapping("/projects/{id}")
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }
}

