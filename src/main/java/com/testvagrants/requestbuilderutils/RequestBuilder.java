package com.testvagrants.requestbuilderutils;

import static io.restassured.RestAssured.given;

import com.testvagrants.enums.ConfigProperty;
import com.testvagrants.projectutils.PropertyReader;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {

	private RequestBuilder() {

	}

	public static RequestSpecification buildGetRequest() {

		return given()
				
						.baseUri(PropertyReader.getConfigPropertyValue(ConfigProperty.BASEURI))
						.log()
						.all();
	}

	public static Response buildPostRequest(Object body) {

		return buildGetRequest()
				
						.contentType(ContentType.JSON)
						.body(body)
						.post();
	}
	
	public static Response buildDeleteRequest() {
		
		return buildGetRequest()
				
						.delete();
	}
}
