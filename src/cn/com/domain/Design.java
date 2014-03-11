package cn.com.domain;

import java.io.Serializable;

public class Design implements Serializable {

	private static final long serialVersionUID = 1L;
	private int designId;
	private String name;
	private String uploadAddress;
	private String uploadName;
	private String designDate;
	private float price;
	private String introduction;
	private int userId;
	private int state;
	private int designtype;
	private int spare;
	private String sapreStr;
	private String bigPictureName;
	private String bigPictureSystemName;
	private String smallPictureName;
	private String smallPictureSystemName;
	private String description;
    public static String designDO="designDO";
	public int getDesignId() {
		return designId;
	}

	public void setDesignId(int designId) {
		this.designId = designId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUploadAddress() {
		return uploadAddress;
	}

	public void setUploadAddress(String uploadAddress) {
		this.uploadAddress = uploadAddress;
	}

	public String getUploadName() {
		return uploadName;
	}

	public void setUploadName(String uploadName) {
		this.uploadName = uploadName;
	}

	
	public String getDesignDate() {
		return designDate;
	}

	public void setDesignDate(String designDate) {
		this.designDate = designDate;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getDesigntype() {
		return designtype;
	}

	public void setDesigntype(int designtype) {
		this.designtype = designtype;
	}

	public int getSpare() {
		return spare;
	}

	public void setSpare(int spare) {
		this.spare = spare;
	}

	public String getSapreStr() {
		return sapreStr;
	}

	public void setSapreStr(String sapreStr) {
		this.sapreStr = sapreStr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getBigPictureName() {
		return bigPictureName;
	}

	public void setBigPictureName(String bigPictureName) {
		this.bigPictureName = bigPictureName;
	}

	public String getBigPictureSystemName() {
		return bigPictureSystemName;
	}

	public void setBigPictureSystemName(String bigPictureSystemName) {
		this.bigPictureSystemName = bigPictureSystemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSmallPictureName() {
		return smallPictureName;
	}

	public void setSmallPictureName(String smallPictureName) {
		this.smallPictureName = smallPictureName;
	}

	public String getSmallPictureSystemName() {
		return smallPictureSystemName;
	}

	public void setSmallPictureSystemName(String smallPictureSystemName) {
		this.smallPictureSystemName = smallPictureSystemName;
	}	
	
}
