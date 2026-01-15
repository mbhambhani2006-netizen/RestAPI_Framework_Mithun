package com.DTOTests;


import com.DTO.Login_DTO;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DTO_001 {
	
	@Test
	public void postThrDto() {
		Login_DTO login=new Login_DTO();
		
		login.setName("anish");
		login.setStatus("Active");
		login.setGender("male");
		login.setEmail("ascd@gmail.com");
		
		given()
		.body(login)
		.contentType(ContentType.JSON)
		.header("Authorization","Bearer 31d59fe78053372338092ea3d690671419c49eccb33656e29417a305e2463f70")
		.log().all().when()
		.post("https://gorest.co.in/public/v2/users")	
		.then()
		//.assertThat().statusCode(201)
		.log()	.all();
		
		
	}

}
