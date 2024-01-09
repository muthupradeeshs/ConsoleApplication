package com.muthupradeesh.mailmanagement.usermanagement;

import com.muthupradeesh.mailmanagement.repository.MailDataBase;

public class UserManagementViewModel {
	public boolean userIsFound(String userId) {
		if (MailDataBase.getDb().getUserDetails().containsKey(userId)) {
			return true;
		}
		return false;

	}
}