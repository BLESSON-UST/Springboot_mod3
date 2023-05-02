package com.ust.mapping.Repository;

import com.ust.mapping.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project,Long> {
}
