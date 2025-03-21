package com.taskforge.Task_Forge.Repository;

import com.taskforge.Task_Forge.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
    List<Project> findByCompanyId(UUID companyId);
}
