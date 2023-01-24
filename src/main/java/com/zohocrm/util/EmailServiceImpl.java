package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMail;
	
	@Override
	public void SendEmail(String to, String Sub, String Msg) {
	
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setSubject(Sub);
		mail.setText(Msg);
		
		javaMail.send(mail);

	}

}
