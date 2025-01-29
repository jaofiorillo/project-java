package com.fiorillo.project.api.modules.role.repository;

import com.fiorillo.project.api.modules.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
