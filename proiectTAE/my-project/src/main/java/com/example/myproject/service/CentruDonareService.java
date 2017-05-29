package com.example.myproject.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.myproject.model.CentruDonare;

@Service
public class CentruDonareService {

	Hashtable<String, CentruDonare> centre = new Hashtable<>();

	public CentruDonareService() {
		CentruDonare cd = new CentruDonare(1, "Bucuresti,sect 3");
		centre.put("1", cd);

		cd = new CentruDonare(2, "Bucuresti,sect2");
		centre.put("2", cd);

		cd = new CentruDonare(3, "Bucuresti,sect5");
		centre.put("3", cd);

		cd = new CentruDonare(4, "Bucuresti,sect6");
		centre.put("4", cd);
	}

	
	
	public CentruDonare getCentru(String id) {
		if (centre.contains(id))
			return centre.get(id);
		else
			return null;
	}
	
	public Hashtable<String, CentruDonare> getAll(){
		return centre;
	}
}
