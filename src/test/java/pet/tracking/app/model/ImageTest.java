package pet.tracking.app.model;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ImageTest {
	
	@Test
	public void testImgId() {
		Image img = new Image.Builder().imgId(0001).build();
		Assert.assertThat(img.getImgId(), CoreMatchers.is(00001));
	}
	
	@Test
	public void testImgPath() {
		Path imgPath = Paths.get("/images/");
		Image img = new Image.Builder().imgId(0001).imgPath(imgPath).build();
		Assert.assertThat(img.getImgPath(), CoreMatchers.is(imgPath));
	}
	
	@Test
	public void testImgName() {
		Image img = new Image.Builder().imgName("Fluffy").build();
		Assert.assertThat(img.getImgName(), CoreMatchers.is("Fluffy"));
	}
	
	@Test
	public void testDateOfImg() {
		Image img1 = new Image.Builder().build();
		Assert.assertNull(img1.getDateOfImg());
		
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		Image img2 = new Image.Builder().dateOfImg(d).build();
		Assert.assertThat(img2.getDateOfImg(), CoreMatchers.is(d));	
	}
	
	@Test
	public void testPetId() {
		Image img = new Image.Builder().petId(0001).build();
		Assert.assertThat(img.getPetId(), CoreMatchers.is(0001));
	}

}
