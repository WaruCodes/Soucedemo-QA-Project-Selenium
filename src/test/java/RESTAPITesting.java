import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RESTAPITesting {

    //Verify a post can be retrieved
    @Test
    public void verifyGetPost() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        int statusCode = given()
                .when()
                .get("/posts/1")
                .then()
                .extract()
                .statusCode();

        Assert.assertEquals(statusCode, 200);

        System.out.println("GET Test Passed");
    }

    //Create a post
    @Test
    public void verifyCreatePost() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        String body = """
            {
              "title":"QA Assignment",
              "body":"REST Assured Test",
              "userId":1
            }
            """;

        int statusCode = given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post("/posts")
                .then()
                .extract()
                .statusCode();

        Assert.assertEquals(statusCode, 201);

        System.out.println("POST Test Passed");
    }

    //Request a post that does not exist.
    @Test
    public void verifyInvalidPost() {

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        int statusCode = given()
                .when()
                .get("/posts/999999")
                .then()
                .extract()
                .statusCode();

        Assert.assertEquals(statusCode, 404);

        System.out.println("Negative Test Passed");
    }
}
