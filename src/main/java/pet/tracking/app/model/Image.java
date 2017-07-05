package pet.tracking.app.model;

import java.nio.file.Path;
import java.util.Date;
import java.util.Locale.Builder;

public class Image {
	
	private final int imgId;
	private final Path imgPath;
	private final String imgName;
	private final Date dateOfImg;
	private final int petId;
	
	private Image (Builder builder){
		this.imgId = builder.imgId;
		this.imgPath = builder.imgPath;
		this.imgName = builder.imgName;
		this.dateOfImg = builder.dateOfImg;
		this.petId = builder.petId;
	}

	public int getImgId() {
		return imgId;
	}

	public Path getImgPath() {
		return imgPath;
	}

	public String getImgName() {
		return imgName;
	}

	public Date getDateOfImg() {
		return dateOfImg;
	}
	
	public int getPetId() {
		return petId;
	}
	
	public static class Builder{
		
		private int imgId;
		private Path imgPath;
		private String imgName;
		private Date dateOfImg;
		private int petId;
		
		public Builder imgId(int imgId){
			this.imgId = imgId;
			return this;
		}
		
		public Builder imgPath(Path imgPath){
			this.imgPath = imgPath;
			return this;
		}

		public Builder imgName(String imgName){
			this.imgName = imgName;
			return this;
		}
		
		public Builder dateOfImg(Date dateOfImg){
			this.dateOfImg = dateOfImg;
			return this;
		}
		
		public Builder petId(int petId){
			this.petId = petId;
			return this;
		}
		
		public Image build(){
			return new Image(this);
		}
	}

}
