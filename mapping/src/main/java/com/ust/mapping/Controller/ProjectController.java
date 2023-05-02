package com.ust.mapping.Controller;

import com.ust.mapping.Entity.Project;
import com.ust.mapping.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pro")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping("/add")
    public Project add(Project project)
    {
       return projectService.add(project);
    }
    @GetMapping("/get")
    public List<Project> getallpro()
    {
        return projectService.getallpro();
    }
    @DeleteMapping("/del/{pro_id}")
    public String del(Long pro_id)
    {
        projectService.del(pro_id);
        return ("The data with "+pro_id+" is removed");
    }
}
