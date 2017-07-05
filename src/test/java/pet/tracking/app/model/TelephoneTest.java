package pet.tracking.app.model;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TelephoneTest {
	@Test
	public void testAreaCode() {
		Telephone phone = new Telephone.Builder().areaCode(816).build();
		Assert.assertThat(phone.getAreaCode(), CoreMatchers.is(816));
	}
	
	@Test
	public void testPrefix() {
		Telephone phone = new Telephone.Builder().prefix(377).build();
		Assert.assertThat(phone.getPrefix(), CoreMatchers.is(377));
	}
	
	@Test
	public void testLineNumber() {
		Telephone phone = new Telephone.Builder().lineNumber(1860).build();
		Assert.assertThat(phone.getLineNumber(), CoreMatchers.is(1860));
	}
	
	@Test
	public void testLineExtension() {
		Telephone phone = new Telephone.Builder().lineExtension(12).build();
		Assert.assertThat(phone.getLineExtension(), CoreMatchers.is(12));
	}
	
	@Test
	public void testCountryCode() {
		Telephone phone = new Telephone.Builder().countryCode(1).build();
		Assert.assertThat(phone.getCountryCode(), CoreMatchers.is(1));
	}
	
	@Test
	public void testTelephoneType() {
		Telephone phone = new Telephone.Builder().telephoneType(TelephoneType.HOME).build();
		Assert.assertThat(phone.getTelephoneType(), CoreMatchers.is(TelephoneType.HOME));
	}
}
