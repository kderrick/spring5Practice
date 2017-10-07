package com.practiceWithSpring5.spring5Practice.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class smtpMailSender implements MailSender{
	
	private static Log log = LogFactory.getLog(smtpMailSender.class);
	
	public void send(String emailTo, String emailSubject, String emailBody) {
		log.info("Sending SMTP mail to" + emailTo);
		log.info("with subject" + emailSubject);
		log.info("and body" + emailBody);
	}
	
	

}