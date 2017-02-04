package pet.tracking.app.model;

import java.util.Date;
import java.util.Locale.Builder;

/*
 * Class for Pet Object
 * @author rapursley
 */
public class Pet {
	
	private final String petName;
	private final String petNickName;
	private final Date dateOfBirth;
	private final Date dateOfAdoption;
	private final Date dateOfDeath;
	private final String classification;
	private final String species;
	private final String sex;	
	
	private Pet (Builder builder){
		this.petName = builder.petName;
		this.petNickName = builder.petNickName;
		this.dateOfBirth = builder.dateOfBirth;
		this.dateOfAdoption = builder.dateOfAdoption;
		this.dateOfDeath = builder.dateOfDeath;
		this.classification = builder.classification;
		this.species = builder.species;
		this.sex = builder.sex;		
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

	public String getClassification() {
		return classification;
	}

	public String getSpecies() {
		return species;
	}

	public String getSex() {
		return sex;
	}
	
	public static class Builder{
		private String petName;
		private String petNickName;
		private Date dateOfBirth;
		private Date dateOfAdoption;
		private Date dateOfDeath;
		private String classification;
		private String species;
		private String sex;
		
		public Builder petName(String petName){
			this.petName = petName;
			return this;
		}
		
		public Builder petNickName(String petNickName){
			this.petNickName = petNickName;
			return this;
		}
		
		public Builder dateofBirth(Date dateOfBirth){
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
		
		public Builder classification(String classification){
			this.classification = classification;
			return this;
		}
		
		public Builder species(String species){
			this.species = species;
			return this;
		}
		
		public Builder sex(String sex){
			this.sex = sex;
			return this;
		}
		
		public Pet build(){
			return new Pet(this);
		}
	}
	
}
