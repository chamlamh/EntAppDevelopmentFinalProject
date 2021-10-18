package com.uc.BoredNoMore.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ActivityDTO {

	private String activity;
	private String type;
	private int participants;
	private double price;
	private double accessibility;
	
	public ActivityDTO(String activity, String type, int participants, double price, double accessibility) {
		this.activity = activity;
		this.type = type;
		this.participants = participants;
		this.price = price;
		this.accessibility = accessibility;
	}
	public ActivityDTO() {}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
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
		return "activitys [activity=" + activity + ", type=" + type + ", participants=" + participants + ", price=" + price
				+ ", accessibility=" + accessibility + "]";
	}
	
	
	
}
