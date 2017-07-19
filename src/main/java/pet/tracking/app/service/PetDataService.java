package pet.tracking.app.service;

import java.util.List;

import pet.tracking.app.model.Pet;

public interface PetDataService {
	
	public abstract Pet getPetData(int petId);
	public abstract List<Pet> getAllPetData();

}
