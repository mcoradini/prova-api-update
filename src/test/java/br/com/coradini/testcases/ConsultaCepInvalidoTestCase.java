package br.com.coradini.testcases;

import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ConsultaCepInvalidoTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/9106090/json";
    }

    @Test
    public void consultaCepInvalidoTest() {
        when().
                get().
        then().
                statusCode(400).
                body("html.body.h3", equalTo("Verifique a sua URL (Bad Request)"));
    }

}
