package com.uc.BoredNoMore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
@Table(name="activities")
public class ActivityDTO {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="name")
	private String activity;
	@Column(name="type")
	private String type;
	@Column(name="participants")
	private int participants;
	@Column(name="price")
	private double price;
	@Column(name="accessibility")
	private double accessibility;
	@Column(name="isFinished")
	private boolean isFinished;
	
	public ActivityDTO(String activity, String type, int participants, double price, double accessibility) {
		this.activity = activity;
		this.type = type;
		this.participants = participants;
		this.price = price;
		this.accessibility = accessibility;
		this.isFinished = false;
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
	
	public boolean getIsFinished() {
		return isFinished;
	}
	
	public void setIsFinsihed(boolean isFinished) {
		this.isFinished = isFinished;
	}

	@Override
	public String toString() {
		return "activitys [activity=" + activity + ", type=" + type + ", participants=" + participants + ", price=" + price
				+ ", accessibility=" + accessibility + "]";
	}
	
	
	
}
