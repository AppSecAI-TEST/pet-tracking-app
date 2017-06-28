package pet.tracking.app.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class DemographicsTest {
	
	@Test
	public void testGetSex() {
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).build();
		Assert.assertThat(person.getSex(), CoreMatchers.is(Sex.FEMALE));
	}
	
	@Test(expected = IllegalStateException.class)
	public void testSexNotSet() {
		new Demographics.Builder().build();
	}
	
	@Test
	public void testGetPersonId() {
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).personId(00001).build();
		Assert.assertThat(person.getPersonId(), CoreMatchers.is(00001));
	}
	
	@Test
	public void testGetPersonFullName(){
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).personFullName("Rebecca Ann Ancell").build();
		Assert.assertThat(person.getPersonFullName(), CoreMatchers.is("Rebecca Ann Ancell"));
	}
	
	@Test
	public void testGetPersonFirstName(){
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).personFirstName("Rebecca").build();
		Assert.assertThat(person.getPersonFirstName(), CoreMatchers.is("Rebecca"));
	}
	
	@Test
	public void testGetPersonMiddleName(){
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).personMiddleName("Ann").build();
		Assert.assertThat(person.getPersonMiddleName(), CoreMatchers.is("Ann"));
	}
	
	@Test
	public void testGetPersonLastName(){
		Demographics person = new Demographics.Builder().sex(Sex.FEMALE).personLastName("Ancell").build();
		Assert.assertThat(person.getPersonLastName(), CoreMatchers.is("Ancell"));
	}
	
	@Test
	public void testGetAddresses(){
		Demographics person1 = new Demographics.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(person1.getAddresses());
		
		List<Address> l = new ArrayList<Address>();
		//l.add("413 SE Lana Ct");
		//l.add("");
		//l.add("");
		//l.add("");
		//l.add("Lee's Summit");
		//l.add("MO");
		//l.add("64063");
		
		Demographics person2 = new Demographics.Builder().sex(Sex.FEMALE).addresses(l).build();
		Assert.assertThat(person2.getAddresses(), CoreMatchers.is(l));
	}
	
	@Test
	public void testGetTelephones(){
		Demographics person1 = new Demographics.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(person1.getTelephones());
		
		List<Telephone> l = new ArrayList<Telephone>();
		//l.add(816, null);
		//l.add(377, null);
		//l.add(1860, null);
		
		Demographics person2 = new Demographics.Builder().sex(Sex.FEMALE).telephones(l).build();
		Assert.assertThat(person2.getTelephones(), CoreMatchers.is(l));
	}
	
	@Test
	public void testGetDateOfBirth() {
		Demographics person1 = new Demographics.Builder().sex(Sex.FEMALE).build();
		Assert.assertNull(person1.getDateOfBirth());
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		Demographics person2 = new Demographics.Builder().sex(Sex.FEMALE).dateOfBirth(d).build();
		Assert.assertThat(person2.getDateOfBirth(), CoreMatchers.is(d));
	}

}
