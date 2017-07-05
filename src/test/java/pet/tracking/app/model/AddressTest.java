package pet.tracking.app.model;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
	@Test
	public void testAddressLine1() {
		Address address = new Address.Builder().addressLine1("527 E Walnut").build();
		Assert.assertThat(address.getAddressLine1(), CoreMatchers.is("527 E Walnut"));
	}
	
	@Test
	public void testAddressLine2() {
		Address address = new Address.Builder().addressLine2("Apt# 204").build();
		Assert.assertThat(address.getAddressLine2(), CoreMatchers.is("Apt# 204"));
	}
	
	@Test
	public void testAddressLine3() {
		Address address = new Address.Builder().addressLine3("Springfield, MO").build();
		Assert.assertThat(address.getAddressLine3(), CoreMatchers.is("Springfield, MO"));
	}
	
	@Test
	public void testAddressLine4() {
		Address address = new Address.Builder().addressLine4("65803").build();
		Assert.assertThat(address.getAddressLine4(), CoreMatchers.is("65803"));
	}
	
	@Test
	public void testCity() {
		Address address = new Address.Builder().city("Springfield").build();
		Assert.assertThat(address.getCity(), CoreMatchers.is("Springfield"));
	}
	
	@Test
	public void testState() {
		Address address = new Address.Builder().state("MO").build();
		Assert.assertThat(address.getState(), CoreMatchers.is("MO"));
	}
	
	@Test
	public void testZipCode() {
		Address address = new Address.Builder().zipCode("65803").build();
		Assert.assertThat(address.getZipCode(), CoreMatchers.is("65803"));
	}
	
	@Test
	public void testAddressType() {
		Address address = new Address.Builder().addressType(AddressType.HOME).build();
		Assert.assertThat(address.getAddressType(), CoreMatchers.is(AddressType.HOME));
	}
}
