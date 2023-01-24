package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	public void SaveLead(Lead lead);

	public Lead findLeadById(long id);

	public void DeleteLeadById(long id);

	public List<Lead> ListAllLeads();
}
