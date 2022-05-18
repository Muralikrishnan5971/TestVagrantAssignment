package com.testvagrants.projectutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.testvagrants.constants.FrameworkConstants;
import com.testvagrants.enums.ConfigProperty;

public class PropertyReader {

	private PropertyReader() {

	}

	private static final Properties properties = new Properties();
	private static final Map<String, String> CONFIG_MAP = new HashMap<>();

	static {

		try (FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigPropertiesFilePath())) {

			properties.load(fis);

		} catch (IOException exception) {

			exception.printStackTrace();

			System.exit(0);
		}

		properties.entrySet().forEach(e -> CONFIG_MAP.put(String.valueOf(e.getKey()), String.valueOf(e.getValue())));

	}

	public static String getConfigPropertyValue(ConfigProperty congifProperty) {

		return CONFIG_MAP.get(congifProperty.name().toLowerCase());
	}
}
