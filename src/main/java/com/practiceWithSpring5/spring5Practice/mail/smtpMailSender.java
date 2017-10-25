package com.practiceWithSpring5.spring5Practice.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;


public class SmtpMailSender implements MailSender{
	
	private static Log log = LogFactory.getLog(SmtpMailSender.class);
	
	private JavaMailSender javaMailSender;
	
	public SmtpMailSender(JavaMailSender javaMailSender) {
		
		this.javaMailSender = javaMailSender;
	}

	public void send(String emailTo, String emailSubject, String emailBody) throws MessagingException{
		
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;
		
		helper = new MimeMessageHelper(message, true);  //true indicates multipart message
		
		helper.setSubject(emailSubject);
		helper.setTo(emailTo);
		helper.setText(emailBody, true); //true indicates html
		
		//helper can be used for additional functionality, ie attachments/etc
		
		
		javaMailSender.send(message);
		
	}
	
	
	
	
	

}
