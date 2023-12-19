package com.onlineshoe.pojo;

public class Shoe
{
	private int shoeId;
	private String shoeTitle,shoeDescription;
	
	public Shoe(String shoeTitle, String shoeDescription) {
		super();
		this.shoeTitle = shoeTitle;
		this.shoeDescription = shoeDescription;
	}

	public Shoe(int shoeId, String shoeTitle, String shoeDescription) {
		super();
		this.shoeId = shoeId;
		this.shoeTitle = shoeTitle;
		this.shoeDescription = shoeDescription;
	}

	public int getShoeId() {
		return shoeId;
	}

	public void setShoeId(int shoeId) {
		this.shoeId = shoeId;
	}

	public String getShoeTitle() {
		return shoeTitle;
	}

	public void setShoeTitle(String shoeTitle) {
		this.shoeTitle = shoeTitle;
	}

	public String getShoeDescription() {
		return shoeDescription;
	}

	public void setShoeDescription(String shoeDescription) {
		this.shoeDescription = shoeDescription;
	}
	
	
}
