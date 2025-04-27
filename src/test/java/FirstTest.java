import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    
    @Test
    public void testFirst() {
        RestAssured.baseURI = "https://reqres.in/api";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("/users/2");
        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}

