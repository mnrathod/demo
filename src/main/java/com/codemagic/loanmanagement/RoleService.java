package com.codemagic.loanmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {
	
	@Autowired
	RoleRepository roleRepository;
	
	@Transactional
	public List<Role> findByName(String name) {
		return roleRepository.findByName(name);
	}
	
	@Transactional
	public Role getById(Integer id) {
		return roleRepository.findById(id).get();
	}
	
	@Transactional
	public boolean addRole(Role role) {
		return roleRepository.save(role)  != null;
	}

	@Transactional
	public boolean updateRole(Role role) {
		return roleRepository.save(role)  != null;
	}

	@Transactional
	public List<Role> getAllRoles() {
		return (List<Role>) roleRepository.findAll();
	}

}
