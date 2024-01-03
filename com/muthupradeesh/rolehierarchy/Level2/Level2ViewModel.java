package com.muthupradeesh.rolehierarchy.Level2;

import com.muthupradeesh.rolehierarchy.dto.RoleManagement;

public class Level2ViewModel {
	public void addSubRole(RoleManagement rootRole, String subRoleName, String reportingToRoleName) {
        RoleManagement reportingToRole = findRole(rootRole, reportingToRoleName);
        if (reportingToRole != null) {
            RoleManagement subRole = new RoleManagement(subRoleName);
            reportingToRole.getSubRoles().add(subRole);
        } else {
            System.out.println("Error: Reporting to role not found.");
        }
    }
	public static RoleManagement findRole(RoleManagement rootRole, String roleToFind) {
        if (rootRole.getName().equals(roleToFind)) {
            return rootRole;
        }

        for (RoleManagement subRole : rootRole.getSubRoles()) {
            RoleManagement foundRole = findRole(subRole, roleToFind);
            if (foundRole != null) {
                return foundRole;
            }
        }

        return null;
    }


}
