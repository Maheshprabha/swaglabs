package com.atmecs.swaglabs.datalocators;

import java.util.Properties;

import com.atmecs.swaglabs.filepath.FilePath;
import com.atmecs.swaglabs.utils.LocationReader;

public class DataLocators {
	Properties property;
	public String username;
	public String password;
	public String login;
	public String addtocart;
	public String shoppingcontainer;
	public String checkout;
	public String firstname;
	public String lastname;
	public String zipcode;
	public String continuebutton;
	public String clickbutton;

	public void getPathData() throws Exception {
		property = LocationReader.readLocation(FilePath.locator_path);
		setUsername();
		setPassword();
		setLogin();
		setAddtocart();
		setShoppingcontainer();
		setCheckout();
		setFirstname();
		setLastname();
		setZipcode();
		setContinuebutton();
		setClickbutton();
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname() {
		lastname = property.getProperty("loc_lastname");
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname() {
		firstname = property.getProperty("loc_firstname");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername() {
		username = property.getProperty("loc_username");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword() {
		password = property.getProperty("loc_password");
	}

	public String getLogin() {
		return login;
	}

	public void setLogin() {
		login = property.getProperty("loc_login");
	}

	public String getAddtocart() {
		return addtocart;
	}

	public void setAddtocart() {
		addtocart = property.getProperty("loc_addtocart");
	}

	public String getShoppingcontainer() {
		return shoppingcontainer;
	}

	public void setShoppingcontainer() {
		shoppingcontainer = property.getProperty("loc_clickcontainer");
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout() {
		checkout = property.getProperty("loc_checkout");
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode() {
		zipcode = property.getProperty("loc_zipcode");

	}

	public String getContinuebutton() {
		return continuebutton;
	}

	public void setContinuebutton() {
		continuebutton = property.getProperty("loc_continuebutton");
	}

	public String getClickbutton() {
		return clickbutton;
	}

	public void setClickbutton() {
		clickbutton = property.getProperty("loc_finishbutton");
	}
}
