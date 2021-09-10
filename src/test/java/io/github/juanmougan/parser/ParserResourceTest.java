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
                .body(ParserResponse.Fields.content, is("This is the parsed text"))
                .body(ParserResponse.Fields.hash, is("7LR3tjlUmWJi2qq5seKT6fuhggPTRj0LTtjn4yucb5c="));
    }
}
