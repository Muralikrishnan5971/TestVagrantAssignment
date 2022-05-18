package com.testvagrants.projectutils;

import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.response.Response;
import lombok.SneakyThrows;

public class JsonUtils {

	private JsonUtils() {

	}

	@SneakyThrows
	public static String readJsonAndGetAsString(String filePath) {

		return new String(Files.readAllBytes(Paths.get(filePath)));
	}

	@SneakyThrows
	public static void storeResponseAsJsonFile(String filePath, Response response) {

		Files.write(Paths.get(filePath), response.asByteArray());
	}
}
