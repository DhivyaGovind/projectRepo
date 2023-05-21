package com.adactin.page;

import com.adactin.baseClass.BaseClass;
import com.adactin.locators.SelectHotelLocators;

public class SelectHotelExe extends SearchHotelExe {
	public static void radiobutton() {
		BaseClass.clickbutton(BaseClass.findElementBy(SelectHotelLocators.radiobutton_0));
	}

	public static void continues() {
		BaseClass.clickbutton(BaseClass.findElementBy(SelectHotelLocators.continues));
	}
}
