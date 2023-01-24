package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.BillService;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService conService;

	@Autowired
	private BillService billService;
	
	@RequestMapping("/GenerateBill")
	public String ViewBillingPage(@RequestParam("id")long id, Model model) {
		 Contact contact = conService.findcontactId(id);
		 model.addAttribute("contact", contact);
		return "Generatebill";
		
	}
	
	@RequestMapping("/SaveBill")
	public String Savebill(@ModelAttribute("Bill")Billing Bill, ModelMap model) {
		billService.Savebill(Bill);
		model.addAttribute("Bill", Bill);
		return "Viewbill";
	}
	
}
