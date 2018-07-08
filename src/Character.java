import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "character")
@XmlAccessorType (XmlAccessType.FIELD)
public class Character {

	public static enum Sex {male, female};
	public static enum SkinColor {black, white};
	public static enum HairType {bald, shorthair, longhair, curly};
	public static enum HairColor {black, blond, brown, red, notapplicable};
	
	private String name;
	private boolean hat;
	private Sex sex;
	private SkinColor skinColor;
	private boolean glasses;
	private HairType hairType;
	private HairColor hairColor; 
	private boolean moustache;
	private boolean beard;
	private String photo;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public boolean wearsHat() {
		return hat;
	}
	
	public void setHat(boolean hat) {
		this.hat = hat;
	}
	
	public boolean wearsGlasses() {
		return glasses;
	}
	
	public void setGlasses(boolean glasses) {
		this.glasses = glasses;
	}
	
	public boolean hasMoustache() {
		return moustache;
	}
	
	public void setMoustache(boolean moustache) {
		this.moustache = moustache;
	}
	
	public boolean hasBeard() {
		return beard;
	}
	
	public void setBeard(boolean beard) {
		this.beard = beard;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public SkinColor getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(SkinColor skinColor) {
		this.skinColor = skinColor;
	}

	public HairType getHairType() {
		return hairType;
	}

	public void setHairType(HairType hairType) {
		this.hairType = hairType;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}
}
