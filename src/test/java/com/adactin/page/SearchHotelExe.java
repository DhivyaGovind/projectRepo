package com.adactin.page;

import org.openqa.selenium.support.ui.Select;

import com.adactin.baseClass.BaseClass;
import com.adactin.locators.SearchHotelLocators;

public class SearchHotelExe extends LoginPageExe {
	public static void location() {
		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.location));
		BaseClass.selectByvisibletext(readAllValues(2, 0, "Sheet2"));
	}

	public static void hotels() {
		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.hotels));
		BaseClass.selectByvisibletext(readAllValues(1, 1, "Sheet2"));
	}

	public static void roomType() {

		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.roomType));
		BaseClass.selectByvisibletext(readAllValues(3, 2, "Sheet2"));
	}

	public static void numberOfRooms() {
		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.room_nos));
		BaseClass.selectByvisibletext(readAllValues(1, 3, "Sheet2"));

	}

	public static void checkInDate() {
		BaseClass.clearButton(BaseClass.findElementBy(SearchHotelLocators.datepick_in));
		BaseClass.send_keys(BaseClass.findElementBy(SearchHotelLocators.datepick_in), readAllValues(2, 4, "Sheet2"));
	}

	public static void checkOutDate() {
		BaseClass.clearButton(BaseClass.findElementBy(SearchHotelLocators.datepick_out));
		BaseClass.send_keys(BaseClass.findElementBy(SearchHotelLocators.datepick_out), readAllValues(3, 5, "Sheet2"));

	}

	public static void adultPerRoom() {
		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.adult_room));
		BaseClass.selectByvisibletext(readAllValues(2, 3, "Sheet2"));
	}

	public static void childrenPerRoom() {
		BaseClass.dropDownoptions(BaseClass.findElementBy(SearchHotelLocators.child_room));
		BaseClass.selectByvisibletext(readAllValues(1, 3, "Sheet2"));
	}

	public static void search() {
		BaseClass.clickbutton(BaseClass.findElementBy(SearchHotelLocators.Submit));
	}

}
