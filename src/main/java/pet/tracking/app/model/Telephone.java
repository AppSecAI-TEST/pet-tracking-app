package pet.tracking.app.model;

public class Telephone {
	
	private final int areaCode;
	private final int prefix;
	private final int lineNumber;
	private final int lineExtension;
	private final int countryCode;
	private final TelephoneType telephoneType;
	
	private Telephone(Builder builder){
		this.areaCode = builder.areaCode;
		this.prefix = builder.prefix;
		this.lineNumber = builder.lineNumber;
		this.lineExtension = builder.lineExtension;
		this.countryCode = builder.countryCode;
		this.telephoneType = builder.telephoneType;
		
	}
	
	public int getAreaCode(){
		return areaCode;
	}
	public int getPrefix(){
		return prefix;
	}
	public int getLineNumber(){
		return lineNumber;
	}
	public int getLineExtension(){
		return lineExtension;
	}
	public int getCountryCode(){
		return countryCode;
	}
	public TelephoneType telephoneType(){
		return telephoneType;
	}
	
	public static class Builder{
		private int areaCode;
		private int prefix;
		private int lineNumber;
		private int lineExtension;
		private int countryCode;
		private TelephoneType telephoneType;
		
		public Builder areaCode(int areaCode){
			this.areaCode = areaCode;
			return this;
		}
		public Builder prefix(int prefix){
			this.prefix = prefix;
			return this;
		}
		public Builder lineNumber(int lineNumber){
			this.lineNumber = lineNumber;
			return this;
		}
		public Builder lineExtension(int lineExtension){
			this.lineExtension = lineExtension;
			return this;
		}
		public Builder countryCode(int countryCode){
			this.countryCode = countryCode;
			return this;
		}
		public Builder telephoneType(TelephoneType telephoneType){
			this.telephoneType = telephoneType;
			return this;
		}
	}

}
