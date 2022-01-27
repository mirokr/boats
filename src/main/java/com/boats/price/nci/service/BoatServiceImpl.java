package com.boats.price.nci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.boats.price.nci.entities.Boat;
import com.boats.price.nci.repo.BoatRepository;








@Component
public class BoatServiceImpl implements BoatService {
	
	@Autowired
	private BoatRepository repository;

	@Override
	public Boat saveBoat(Boat boat) {

		return repository.save(boat);
	}

	@Override
	public Boat updateBoat(Boat boat) {
		
		return repository.save(boat);
	}

	@Override
	public void deleteBoat(Boat boat) {
		
		repository.delete(boat);

	}

	@Override
	public Boat getBoatById(int id) {
		

			return repository.findById(id).get();

	}
	@Override
	public List<Boat> getAllBoats() {
		// changed crud to jpa repository so can return list by findAll
		return repository.findAll();
	}

}
