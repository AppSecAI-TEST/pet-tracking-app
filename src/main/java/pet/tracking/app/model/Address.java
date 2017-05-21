package pet.tracking.app.model;

public class Address {
	
	private final String addressLine1;
	private final String addressLine2;
	private final String addressLine3;
	private final String addressLine4;
	private final String city;
	private final String state;
	private final String zipCode;
	private final AddressType addressType;
	
	private Address(Builder builder){
		
		this.addressLine1 = builder.addressLine1;
		this.addressLine2 = builder.addressLine2;
		this.addressLine3 = builder.addressLine3;
		this.addressLine4 = builder.addressLine4;
		this.city = builder.city;
		this.state = builder.state;
		this.zipCode = builder.zipCode;
		this.addressType = builder.addressType;
	}
	
	public String getAddressLine1(){
		return addressLine1;
	}
	public String getAddressLine2(){
		return addressLine2;
	}
	public String getAddressLine3(){
		return addressLine3;
	}
	public String getAddressLine4(){
		return addressLine4;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZipCode(){
		return zipCode;
	}
	public AddressType getAddressType(){
		return addressType;
	}
	
	public static class Builder{
		private String addressLine1;
		private String addressLine2;
		private String addressLine3;
		private String addressLine4;
		private String city;
		private String state;
		private String zipCode;
		private AddressType addressType;
		
		public Builder addressLine1(String addressLine1){
			this.addressLine1 = addressLine1;
			return this;
		}
		public Builder addressLine2(String addressLine2){
			this.addressLine2 = addressLine2;
			return this;
		}
		public Builder addressLine3(String addressLine3){
			this.addressLine3 = addressLine3;
			return this;
		}
		public Builder addressLine4(String addressLine4){
			this.addressLine4 = addressLine4;
			return this;
		}
		public Builder city(String addressLine4){
			this.city = city;
			return this;
		}
		public Builder state(String addressLine4){
			this.state = state;
			return this;
		}
		public Builder zipCode(String addressLine4){
			this.zipCode = zipCode;
			return this;
		}
		public Builder addressType(AddressType addressType){
			this.addressType = addressType;
			return this;
		}
		
		public Address build(){
			//if(sex == null ){
			//	throw new IllegalStateException("Sex is required.");
			//}
			return new Address(this);
		}
	}
	
}
