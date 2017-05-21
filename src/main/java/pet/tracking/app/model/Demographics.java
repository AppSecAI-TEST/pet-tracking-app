package pet.tracking.app.model;

import java.util.Date;
import java.util.List;

public class Demographics {
	private final int personId;
	private final String personFullName;
	private final String personLastName;
	private final String personFirstName;
	private final String personMiddleName;
	private final Sex sex;
	private final List<Address> addresses;
	private final List<Telephone> telephones;
	private final Date dateOfBirth;
	
	private Demographics(Builder builder){
		this.personId = builder.personId;
		this.personFullName = builder.personFullName;
		this.personFirstName = builder.personFirstName;
		this.personMiddleName = builder.personMiddleName;
		this.personLastName = builder.personLastName;
		this.sex = builder.sex;
		this.addresses = builder.addresses;
		this.telephones = builder.telephones;
		this.dateOfBirth = builder.dateOfBirth;
	}
		
	public int getPersonId(){
		return personId;
	}
	public String getPersonFullName(){
		return personFullName;
	}
	public String getPersonFirstName(){
		return personFirstName;
	}
	public String getPersonMiddleName(){
		return personMiddleName;
	}
	public String getPersonLastName(){
		return personLastName;
	}
	public Sex getSex(){
		return sex;
	}
	public List<Address> getAddresses(){
		return addresses;
	}
	public List<Telephone> getTelephones(){
		return telephones;
	}
	public Date getDateOfBirth(){
		return dateOfBirth;
	}
	
	public static class Builder{
		private int personId;
		private String personFullName;
		private String personLastName;
		private String personFirstName;
		private String personMiddleName;
		private Sex sex;
		private List<Address> addresses;
		private List<Telephone> telephones;
		private Date dateOfBirth; 
		
		public Builder personId(int personId){
			this.personId = personId;
			return this;
		}
		public Builder personFullName(String personFullName){
			this.personFullName = personFullName;
			return this;
		}
		public Builder personFirstName(String personFirstName){
			this.personFirstName = personFirstName;
			return this;
		}
		public Builder personMiddleName(String personMiddleName){
			this.personMiddleName = personMiddleName;
			return this;
		}
		public Builder personLastName(String personLastName){
			this.personLastName = personLastName;
			return this;
		}
		public Builder sex(Sex sex){
			this.sex = sex;
			return this;
		}
		public Builder addresses(List<Address> addresses){
			this.addresses = addresses;
			return this;
		}
		public Builder telephones(List<Telephone> telephones){
			this.telephones = telephones;
			return this;
		}
		public Builder dateOfBirth(Date dateOfBirth){
			this.dateOfBirth = dateOfBirth;
			return this;
		}
	}
	
	

}
