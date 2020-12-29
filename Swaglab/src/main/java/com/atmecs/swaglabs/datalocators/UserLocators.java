package com.atmecs.swaglabs.datalocators;

import java.util.Properties;

import com.atmecs.swaglabs.filepath.FilePath;
import com.atmecs.swaglabs.utils.LocationReader;

public class UserLocators {
	public Properties properties;
	public String Username;
	public String Password;
	public String Firstname;
	public String Lastname;
	public String Zipcode;

	public void getTestData() throws Exception {
		properties = LocationReader.readLocation(FilePath.User_data);
		setUsername();
		setPassword();
		setFirstname();
		setLastname();
		setZipcode();

	}

	public String getZipcode() {
		return Zipcode;
	}

	public void setZipcode() {
		Zipcode = properties.getProperty("zipcode");
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname() {
		Lastname = properties.getProperty("Lastname");
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname() {
		Firstname = properties.getProperty("Firstname");
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername() {
		Username = properties.getProperty("Username");

	}

	public String getPassword() {
		return Password;
	}

	public void setPassword() {
		Password = properties.getProperty("Password");
	}

}
