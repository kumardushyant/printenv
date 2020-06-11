package in.dushyant;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class AppResourceTest {

	@Test
	public void testPrintEnv() {
		given().when().get("/app").then().statusCode(200);
	}
}