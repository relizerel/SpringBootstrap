package com.spring.service;

import com.spring.model.UserRole;
import com.spring.repository.RoleRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
public class RoleServiceImp implements RoleService {

    public final RoleRepo roleRepo;

    public RoleServiceImp(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Transactional
    @Override
    public Set<UserRole> getRoleSet(Set<String> roles) {
        return roleRepo.getRolesByNameIn(roles);
    }
    @Transactional
    @Override
    public UserRole getDefaultRole() {
        String defaultRoleName = "USER";
        return roleRepo.getRoleByName(defaultRoleName);
    }
}
