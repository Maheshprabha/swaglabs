package com.atmecs.swaglabs.testscript;


import java.util.Properties;

import org.testng.annotations.Test;

import com.atmecs.swaglabs.datalocators.DataLocators;
import com.atmecs.swaglabs.datalocators.UserLocators;
import com.atmecs.swaglabs.helpers.CommonHelpers;
import com.atmecs.swaglabs.testsuite.BaseClass;

public class TestSript extends BaseClass {
	Properties property;
	DataLocators path_name = new DataLocators();
	UserLocators user_data = new UserLocators();
    @Test
	public void login() throws Exception {
		path_name.getPathData();
		user_data.getTestData();

		CommonHelpers.SendkeysAction(driver, path_name.getUsername(), user_data.getUsername());
		CommonHelpers.SendkeysAction(driver, path_name.getPassword(), user_data.getPassword());
		CommonHelpers.clickAction(driver, path_name.getLogin());
		CommonHelpers.explicitWait(driver, path_name.getAddtocart());
		CommonHelpers.clickAction(driver, path_name.getAddtocart());
		CommonHelpers.clickAction(driver, path_name.getShoppingcontainer());
		CommonHelpers.clickAction(driver, path_name.getCheckout());
		CommonHelpers.SendkeysAction(driver, path_name.getFirstname(), user_data.getFirstname());
		CommonHelpers.SendkeysAction(driver, path_name.getLastname(), user_data.getLastname());
		CommonHelpers.SendkeysAction(driver, path_name.getZipcode(), user_data.getZipcode());
		CommonHelpers.clickAction(driver, path_name.getContinuebutton());
		CommonHelpers.clickAction(driver, path_name.getClickbutton());
		}
}