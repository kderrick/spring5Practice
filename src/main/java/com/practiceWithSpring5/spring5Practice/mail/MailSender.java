package com.practiceWithSpring5.spring5Practice.mail;

import javax.mail.MessagingException;

public interface MailSender {
	
	void send(String emailTo, String emailSubject, String emailBody) throws MessagingException;

}
