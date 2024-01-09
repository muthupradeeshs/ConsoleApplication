package com.muthupradeesh.mailmanagement.mailmange;

import com.muthupradeesh.mailmanagement.dto.Mail;
import com.muthupradeesh.mailmanagement.repository.MailDataBase;
import com.muthupradeesh.mailmanagement.usermanagement.UserManagementViewModel;

public class MailManagementViewModel {
	public void messageSending(String fromId, String toId, String subject, String message) {
		UserManagementViewModel userManagementViewModel = new UserManagementViewModel();
		long messageId = MailDataBase.getDb().getMessageId();
		Mail mail = new Mail(fromId, toId, subject, message);

		String[] users = toId.split(",");
		String to;
		boolean flag = false;

		for (int i = 0; i < users.length; i++) {
			to = users[i];
			if (userManagementViewModel.userIsFound(to)) {
				flag = true;
				MailDataBase.getDb().getRecividMail(to).put(messageId, mail);
			} else {
				System.out.println("Message Not Send");
			}
		}
		if (flag) {
			MailDataBase.getDb().getSendMessage(fromId).put(messageId, mail);
		}
	}

	public void deleteMessage(String userId, long messageId, String type) {
		if (type.equals("Recived")) {
			MailDataBase.getDb().getRecividMail(userId).remove(messageId);
		} else if (type.equals("Send")) {
			MailDataBase.getDb().getSendMessage(userId).remove(messageId);
		}

	}

}
