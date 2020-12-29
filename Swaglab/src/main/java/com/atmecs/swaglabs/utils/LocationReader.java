package com.atmecs.swaglabs.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LocationReader {
	static Properties property;

	public static Properties readLocation(String path) throws IOException {
		property = new Properties();
		FileInputStream file = new FileInputStream(path);
		property.load(file);
		return property;
	}
}
