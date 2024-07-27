package com.prohm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prohm.entity.Dr;
import com.prohm.repository.Drepository;
@Service
public class Drservicesimpl implements Drservices {

	@Autowired
	private Drepository dreport;
	@Override
	public void savedata(Dr v) {
		

		dreport.save(v);
	}

}
