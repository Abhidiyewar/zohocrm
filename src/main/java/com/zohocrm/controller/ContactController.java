package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/Contact")
	public String ListLeads(ModelMap model) {
		List<Contact> contact = contactService.ListContact();
		model.addAttribute("contact", contact);
		return "Sales";
		
	}

	@RequestMapping("/Contactinfo")
	public String leadinfo(@RequestParam("id") long id, Model model) {
		Contact contact = contactService.findcontactId(id);
		model.addAttribute("contact", contact );
		
		return"list_leads";
	}
}
