package com.testvagrants.constants;

import lombok.Getter;

public class FrameworkConstants {

	private FrameworkConstants() {

	}

	private static final String RESOURCE = System.getProperty("user.dir");

	private static @Getter String configPropertiesFilePath = RESOURCE + "/src/test/resources/propertiesfile/config.properties";
	private static @Getter String testJsonFilePath = "Json/testJson.json";
}
