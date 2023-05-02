package com.ust.mapping.Service;

import com.ust.mapping.Entity.Project;
import com.ust.mapping.Repository.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    public Project add(Project project) {
        return projectRepo.save(project);
    }

    public List<Project> getallpro() {
        return projectRepo.findAll();
    }

    public void del(Long proId) {
        projectRepo.deleteById(proId);
    }
}
