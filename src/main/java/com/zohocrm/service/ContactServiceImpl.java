package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepository conRepo;
	

	@Override
	public void SaveContact(Contact contact) {
		conRepo.save(contact);

	}


	@Override
	public List<Contact> ListContact() {
		List<Contact> contact = conRepo.findAll();
		return contact;
	}


	@Override
	public Contact findcontactId(long id) {
		Optional<Contact> FindContact = conRepo.findById(id);
		Contact contact = FindContact.get();
		return contact;
		
	}

}
