package com.zohocrm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repository.BillRepository;

@Service
public class BillServiceimpl implements BillService {

	@Autowired
	BillRepository billRepo;

	@Override
	public void Savebill(Billing Bill) {
		billRepo.save(Bill);
		
	}


}
