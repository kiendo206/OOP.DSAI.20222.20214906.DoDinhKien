package hust.soict.dsai.aims.media;

import java.util.Date;

public abstract class Media {
	private String title;
	private String category;
	private float cost;
	private Date addedDate;
	
	public Media(String title, String category, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
	public Media() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

}
