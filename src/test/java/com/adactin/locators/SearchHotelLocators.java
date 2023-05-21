package com.adactin.locators;

import org.openqa.selenium.By;

public class SearchHotelLocators extends LoginPageLocators {
//	public static String location = "location";
//	public static String hotels = "hotels";
//	public static String roomType = "room_type";
//	public static String room_nos = "room_nos";
//	public static String datepick_in = "datepick_in";
//	public static String datepick_out = "datepick_out";
//	public static String adult_room = "adult_room";
//	public static String child_room = "child_room";
//	public static String Submit = "Submit";
	
	public static By location=By.id("location");
	public static By hotels=By.id("hotels");
	public static By roomType=By.xpath("//*[@name='room_type']");
	public static By room_nos=By.id("room_nos");
	public static By datepick_in=By.id("datepick_in");
	public static By datepick_out=By.id("datepick_out");
	public static By adult_room=By.id("adult_room");
	public static By child_room=By.id("child_room");
	public static By Submit=By.id("Submit");
	
	}
