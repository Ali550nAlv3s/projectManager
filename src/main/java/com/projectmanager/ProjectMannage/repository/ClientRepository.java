package com.projectmanager.ProjectMannage.repository;

import com.projectmanager.ProjectMannage.domain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}