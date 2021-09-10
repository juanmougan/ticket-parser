package io.github.juanmougan.parser;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ParserResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .contentType(ContentType.JSON)
          .when().post("/parser")
          .then()
             .statusCode(200)
             .body("content", is("This is the parsed text"));
    }

}
