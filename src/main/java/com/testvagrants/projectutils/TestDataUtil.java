package com.testvagrants.projectutils;

public class TestDataUtil {

	private TestDataUtil() {

	}

	public static String getTeamName() {

		return FakerUtils.getName().toLowerCase();
	}

	public static String getTeamLocation() {

		return FakerUtils.getLocation().toLowerCase();
	}
}
