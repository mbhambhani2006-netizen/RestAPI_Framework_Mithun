package com.tests;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import Base.TestBase;

public class FirstTest extends TestBase {

	@Test
	public void getReqresUsers() {
		given().when().get("/api/users?page=2").then()
	//	.assertThat()
	//	.statusCode(200)
		.log().all();
		

	}

}
