package com.tests;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.annotations.Test;

import Base.TestBase;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class FirstTest extends TestBase {

	//@Test
	public void getReqresUsers() {
		given().when().get("/public/v2/users").then()
		.assertThat()
	.statusCode(200)
		.log().all();
		

	}
	
	//@Test
	
	public void createReqresUsers() {
		
		given()
		.body("{\"name\": \"Giriraj Khan\",\r\n"
				+ "    \"email\": \"shandar@streich.test\",\r\n"
				+ "    \"gender\": \"male\",\r\n"
				+ "    \"status\": \"active\"}")
		.contentType(ContentType.JSON)
		.header("Authorization","Bearer 31d59fe78053372338092ea3d690671419c49eccb33656e29417a305e2463f70")
		.log().all()
		.when()	
		.post("/public/v2/users")
		.then()
		.assertThat()
		.statusCode(201)
		.log().all();
		
	}
	@Test
	public void toExtractData() {
		String response=given().when().get("/public/v2/users")
				.then().extract().asString();
		JsonPath json=new JsonPath(response);
		//List<String>names=json.getList("name");
		//System.out.println(names);
		String email=json.getString("[0].email");
		System.out.println(email);
		
		
		
	}
	
	

}
