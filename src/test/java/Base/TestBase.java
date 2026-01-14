package Base;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;

import com.Utilities.ConfigReader;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;

public class TestBase {
	
	@BeforeMethod
	public void setUp() throws IOException {
		RestAssured.baseURI=ConfigReader.get("baseURL");

	}
}
