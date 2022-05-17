package com.testvagrants.projectutils;

import com.github.javafaker.Faker;

public class FakerUtils {

	private FakerUtils() {

	}

	private static final Faker faker = new Faker();

	static String getName() {

		return faker.name().fullName();
	}

	static String getLocation() {

		return faker.country().name();
	}
}
