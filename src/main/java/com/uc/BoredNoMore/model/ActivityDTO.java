package com.uc.BoredNoMore.model;

public class ActivityDTO {

	private String title;
	private String type;
	private int participants;
	private double price;
	private double accessibility;
	
	public ActivityDTO(String title, String type, int participants, double price, double accessibility) {
		this.title = title;
		this.type = type;
		this.participants = participants;
		this.price = price;
		this.accessibility = accessibility;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getAccessibility() {
		return accessibility;
	}

	public void setAccessibility(double accessibility) {
		this.accessibility = accessibility;
	}

	@Override
	public String toString() {
		return "activitys [title=" + title + ", type=" + type + ", participants=" + participants + ", price=" + price
				+ ", accessibility=" + accessibility + "]";
	}
	
	
	
}
