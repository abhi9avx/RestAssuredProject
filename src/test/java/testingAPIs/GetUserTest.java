package testingAPIs;

import base.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;    
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetUserTest extends BaseTest {
    @Test
    public void testGetUser() {
        given()
            .when()
            .get("/users/2")
            .then()
            .statusCode(200);
    }
    
}
