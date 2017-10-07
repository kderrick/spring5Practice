package com.practiceWithSpring5.spring5Practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceWithSpring5.spring5Practice.mail.MockMailSender;

@RestController
public class MailController {
	
	@Autowired
	private MockMailSender mailSender;
	
	@RequestMapping("/mail")
	public String mail() {
		
		mailSender.send("mail@example.com", "A test email!", "Body of the test mail");
		
		return "Mail sent";
	}

}
