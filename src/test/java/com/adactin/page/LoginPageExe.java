package com.adactin.page;

import com.adactin.baseClass.BaseClass;
import com.adactin.locators.BookHotelLocators;
import com.adactin.locators.LoginPageLocators;

public class LoginPageExe extends BookHotelLocators{
	public static void username() {
		BaseClass.send_keys(BaseClass.findElementBy(LoginPageLocators.username), propReader("username"));
	}
	public static void password() {
		BaseClass.send_keys(BaseClass.findElementBy(LoginPageLocators.password), propReader("password"));
	}
	public static void login() {
		
		BaseClass.clickbutton(BaseClass.findElementBy(LoginPageLocators.login));
	}
}
