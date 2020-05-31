package br.com.coradini.testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

public class ConsultaCepInexistenteTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/11111111/json";
    }

    @Test
    public void consultaCepInexistenteTest() {
        when().
                get().
        then().
                statusCode(200).
                body("erro", is(true));
    }

}
