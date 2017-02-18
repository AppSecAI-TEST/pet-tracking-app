package pet.tracking.app.model;

import java.util.Calendar;
import java.util.Date;

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
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").build();
		Assert.assertThat(pet2.getPetNickName(), CoreMatchers.is("Georgy"));
	}
	
	@Test
	public void testGetDateOfDeath(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getDateOfDeath());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").build();
		Assert.assertThat(pet2.getPetNickName(), CoreMatchers.is("Georgy"));
	}
	
	@Test
	public void testGetBreed(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getBreed());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").build();
		Assert.assertThat(pet2.getPetNickName(), CoreMatchers.is("Georgy"));
	}
	
	@Test
	public void testGetSpecies(){
		Pet pet = new Pet.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(pet.getSpecies());
		
		Pet pet2 = new Pet.Builder().sex(Sex.FEMALE).petNickName("Georgy").build();
		Assert.assertThat(pet2.getPetNickName(), CoreMatchers.is("Georgy"));
	}
}
