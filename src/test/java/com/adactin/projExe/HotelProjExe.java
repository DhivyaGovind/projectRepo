package com.adactin.projExe;

import javax.sql.rowset.serial.SerialArray;

import com.adactin.page.BookHotelExe;

public class HotelProjExe extends BookHotelExe {
	public static void main(String[] args) {
		SettingEnvironment("chrome");
		launching(propReader("Url"));
		resizing();
		username();
		password();
		login();
		location();
		hotels();
		roomType();
		numberOfRooms();
		checkInDate();
		checkOutDate();
		adultPerRoom();
		childrenPerRoom();
		search();
		radiobutton();
		continues();
		firstName();
		secondName();
		address();
		creditCardNo();
		creditCardType();
		ExpiryDate();
		cvvNo();
		bookNow();
		order_no();
	}
}
