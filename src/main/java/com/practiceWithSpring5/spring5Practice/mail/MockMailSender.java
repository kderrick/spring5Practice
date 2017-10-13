package com.practiceWithSpring5.spring5Practice.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class MockMailSender implements MailSender{
	
	private static Log log = LogFactory.getLog(MockMailSender.class);
	
	public void send(String emailTo, String emailSubject, String emailBody) {
		log.info("Sending mock mail to" + emailTo);
		log.info("with subject" + emailSubject);
		log.info("and body" + emailBody);
	}
	
	

}
