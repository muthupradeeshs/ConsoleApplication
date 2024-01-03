package com.muthupradeesh.rolehierarchy.dto;

import java.util.ArrayList;
import java.util.List;

public class RoleManagement {
    String name;
	List<RoleManagement> subRoles;

    public RoleManagement(String name) {
        this.name = name;
        this.subRoles = new ArrayList<>();
    }
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<RoleManagement> getSubRoles() {
		return subRoles;
	}

	public void setSubRoles(List<RoleManagement> subRoles) {
		this.subRoles = subRoles;
	}

}
