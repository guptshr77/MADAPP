package com.fbla.student.model;
//lunch menu
public class LunchMenu {
//components
	private String day;
	private String foodItems;
	private String grabNGo;
	private String milks;
//constructors	
	public LunchMenu(String day, String foodItems, String grabNGo, String milks) {
		this.day = day;
		this.foodItems = foodItems;
		this.grabNGo = grabNGo;
		this.milks = milks;
	}
//getters and setters
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getFoodItems() {
		return foodItems;
	}
	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}
	public String getGrabNGo() {
		return grabNGo;
	}
	public void setGrabNGo(String grabNGo) {
		this.grabNGo = grabNGo;
	}
	public String getMilks() {
		return milks;
	}
	public void setMilks(String milks) {
		this.milks = milks;
	}
}
