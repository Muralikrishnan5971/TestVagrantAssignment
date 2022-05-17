package com.testvagrants.constants;

import lombok.Getter;

public class ProjectConstants {

	private ProjectConstants() {

	}

	private static final String RESOURCE = System.getProperty("user.dir");

	private static @Getter String configPropertiesFilePath = RESOURCE + "/src/test/resources/propertiesfile/config.properties";
	private static @Getter String resposeSchemaFilePath = "schema/responseSchema.json";
}
