package com.adactin.page;

import org.openqa.selenium.By;

import com.adactin.baseClass.BaseClass;
import com.adactin.locators.BookHotelLocators;

public class BookHotelExe extends SelectHotelExe {
	public static void firstName() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.first_name), readAllValues(1, 6, "Sheet2"));
	}

	public static void secondName() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.last_name), readAllValues(2, 6, "Sheet2"));
	}

	public static void address() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.address), readAllValues(1, 7, "Sheet2"));
	}

	public static void creditCardNo() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.cc_num), readAllValues(1, 8, "Sheet2"));
	}

	public static void creditCardType() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.cc_type), readAllValues(2, 8, "Sheet2"));
	}

	public static void ExpiryDate() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.cc_exp_month), readAllValues(3, 8, "Sheet2"));
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.cc_exp_year), readAllValues(4, 8, "Sheet2"));
	}

	public static void cvvNo() {
		BaseClass.send_keys(BaseClass.findElementBy(BookHotelLocators.cc_cvv), readAllValues(5, 8, "Sheet2"));
	}

	public static void bookNow() {
		BaseClass.clickbutton(BaseClass.findElementBy(book_now));
	}

	public static void order_no() {
		BaseClass.waits(5000);
		String orderNumber = BaseClass.getAttribute(BaseClass.findElementBy(BookHotelLocators.order_no));
		BaseClass.excelWrite(3, 4, orderNumber, "order");
	
	}
}
