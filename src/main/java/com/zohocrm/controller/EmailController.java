package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;

	@PostMapping("/SendEmail")
	public String GetEmail(@RequestParam("email") String email, Model model) {
		model.addAttribute("email", email);
	   return "compose_mail";	
	}
	
	@PostMapping("/ComposeMail")
	public String ComposeEmail(Email email, Model model) {
		emailService.SendEmail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "Email Sent..!");
		 return "compose_mail";
	}
}
