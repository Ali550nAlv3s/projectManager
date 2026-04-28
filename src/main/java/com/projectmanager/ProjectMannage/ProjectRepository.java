package com.projectmanager.ProjectMannage;

import com.projectmanager.ProjectMannage.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {



}
