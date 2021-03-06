package com.practiceWithSpring5.spring5Practice.controllers;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceWithSpring5.spring5Practice.mail.MailSender;
import com.practiceWithSpring5.spring5Practice.mail.MockMailSender;

@RestController
public class MailController {
	
	
	private MailSender mailSender;
	
	
	public MailController(MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		
		mailSender.send("kderrick1988@gmail.com", "A test email!", "Body of the test mail");
		
		return "Mail sent";
	}
	
	//change

}
