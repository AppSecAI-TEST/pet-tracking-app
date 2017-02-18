package pet.tracking.app.model;

import java.util.Date;
import java.util.Locale.Builder;

/*
 * Class for Pet Object
 * @author rapursley
 */
public class Pet {
	
	private final int petId;
	private final String petName;
	private final String petNickName;
	private final Date dateOfBirth;
	private final Date dateOfAdoption;
	private final Date dateOfDeath;
	private final String breed;	
	private final String species;			//dog, cat, bird, etc.
	private final Sex sex;	
	
	private Pet (Builder builder){
		this.petId = builder.petId;
		this.petName = builder.petName;
		this.petNickName = builder.petNickName;
		this.dateOfBirth = builder.dateOfBirth;
		this.dateOfAdoption = builder.dateOfAdoption;
		this.dateOfDeath = builder.dateOfDeath;
		this.breed = builder.breed;
		this.species = builder.species;
		this.sex = builder.sex;		
	}
	
	public int getPetId() {
		return petId;
	}
	public String getPetName() {
		return petName;
	}

	public String getPetNickName() {
		return petNickName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public Date getDateOfAdoption() {
		return dateOfAdoption;
	}

	public Date getDateOfDeath() {
		return dateOfDeath;
	}

	public String getBreed() {
		return breed;
	}

	public String getSpecies() {
		return species;
	}

	public Sex getSex() {
		return sex;
	}
	
	public static class Builder {
		private int petId;
		private String petName;
		private String petNickName;
		private Date dateOfBirth;
		private Date dateOfAdoption;
		private Date dateOfDeath;
		private String breed;
		private String species;
		private Sex sex;
		
		public Builder petId(int petId){
			this.petId = petId;
			return this;
		}
		
		public Builder petName(String petName){
			this.petName = petName;
			return this;
		}
		
		public Builder petNickName(String petNickName){
			this.petNickName = petNickName;
			return this;
		}
		
		public Builder dateOfBirth(Date dateOfBirth){
			this.dateOfBirth = dateOfBirth;
			return this;
		}
		
		public Builder dateOfAdoption(Date dateOfAdoption){
			this.dateOfAdoption = dateOfAdoption;
			return this;			
		}
		
		public Builder dateOfDeath(Date dateOfDeath){
			this.dateOfDeath = dateOfDeath;
			return this;
		}
		
		public Builder breed(String breed){
			this.breed = breed;
			return this;
		}
		
		public Builder species(String species){
			this.species = species;
			return this;
		}
		
		public Builder sex(Sex sex){
			this.sex = sex;
			return this;
		}
		
		public Pet build(){
			if(sex == null ){
				throw new IllegalStateException("Sex is required.");
			}
			return new Pet(this);
		}
	}
	
}
