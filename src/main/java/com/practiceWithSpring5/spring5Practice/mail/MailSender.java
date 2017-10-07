package com.practiceWithSpring5.spring5Practice.mail;

public interface MailSender {
	
	void send(String emailTo, String emailSubject, String emailBody);

}
