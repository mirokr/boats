package com.boats.price.nci.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.boats.price.nci.entities.Boat;








@Component
public interface BoatService {
	

	Boat saveBoat(Boat boat);
	Boat updateBoat(Boat boat);
	void deleteBoat(Boat boat);
	Boat getBoatById(int id);
	List<Boat> getAllBoats();

}
