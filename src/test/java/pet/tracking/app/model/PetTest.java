package pet.tracking.app.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {
	
	@Test
	public void testGetSex() {
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertThat(pet.getSex(), CoreMatchers.is(Sex.FEMALE));
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSexNotSet() {
		new Pet.Builder().build();
	}
	
	@Test
	public void testGetPetId() {
		Pet pet1 = new Pet.Builder().sex(Sex.FEMALE).petId(00001).build();
		Assert.assertNull(pet1.getPetName());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petName("George").build();
		Assert.assertThat(pet2.getPetId(), CoreMatchers.is(00001));
	}
	
	@Test
	public void testGetPetName() {
		Pet pet1 = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet1.getPetName());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petName("George").build();
		Assert.assertThat(pet2.getPetName(), CoreMatchers.is("George"));
	}
	
	@Test
	public void testGetPetNickName() {
		Pet pet1 = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet1.getPetNickName());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").build();
		Assert.assertThat(pet2.getPetNickName(), CoreMatchers.is("Georgy"));
	}
	
	@Test
	public void testGetDateOfBirth() {
		Pet pet1 = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet1.getDateOfBirth());
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).dateOfBirth(d).build();
		Assert.assertThat(pet2.getDateOfBirth(), CoreMatchers.is(d));
	}
	
	@Test
	public void testGetDateOfAdoption() {
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getDateOfAdoption());
		

		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).dateOfAdoption(d).build();
		Assert.assertThat(pet2.getDateOfAdoption(), CoreMatchers.is(d));
	}
	
	@Test
	public void testGetDateOfDeath(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getDateOfDeath());
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).dateOfDeath(d).build();
		Assert.assertThat(pet2.getDateOfDeath(), CoreMatchers.is(d));
	}
	
	@Test
	public void testGetBreed(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getBreed());
		
		List<String> l = new ArrayList<String>();
		l.add("Saint Bernard");
		l.add("Golden Retreiver");
		l.add("Chessapeake Bay Retreiver");
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").breed(l).build();
		Assert.assertEquals(pet2.getBreed(), CoreMatchers.is(l));
	}
	
	@Test
	public void testGetSpecies(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getSpecies());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").species(Species.CAT).build();
		Assert.assertThat(pet2.getSpecies(), CoreMatchers.is(Species.CAT));
	}
}
