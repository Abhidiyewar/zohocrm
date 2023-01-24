package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {
	
	public void SaveContact(Contact contact);

	public List<Contact> ListContact();

	public Contact findcontactId(long id);

	

}
