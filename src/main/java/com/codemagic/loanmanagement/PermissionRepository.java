package com.codemagic.loanmanagement;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer>{
    List<Permission> findByName(String name);
}
