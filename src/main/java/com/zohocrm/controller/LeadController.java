package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.service.ContactService;
import com.zohocrm.service.LeadService;
import com.zohocrm.util.EmailService;

@Controller
public class LeadController {
	
	//localhost:8080/zoho/ViewPage
	
	@Autowired
	private EmailService emailService;
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;

	@GetMapping("/ViewPage")
	public String viewPage() {
		return"create_lead";
	}
	
	@PostMapping("/SaveLead")
	public String Savelead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadService.SaveLead(lead);
		model.addAttribute("lead", lead);
		emailService.SendEmail(lead.getEmail(), "Testing", "Congratulation Buddy..!");
		return"list_leads";
	}
	
	@PostMapping("/ConvertLead")
	private String ConvertLead(@RequestParam("id") long id, Model model) {
		
		Lead lead = leadService.findLeadById(id);
		
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.SaveContact(contact);
		
		leadService.DeleteLeadById(id);
		List<Contact> con = contactService.ListContact();
		model.addAttribute("contact", con);
		return "Sales";
		
	}
	
	@RequestMapping("/ListAll")
	public String ListLeads(ModelMap model) {
		List<Lead> leads = leadService.ListAllLeads();
		model.addAttribute("leads", leads);
		return "ListSales";
		
	}
	
	@RequestMapping("/Leadinfo")
	public String leadinfo(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		
		return"list_leads";
	}
}






















