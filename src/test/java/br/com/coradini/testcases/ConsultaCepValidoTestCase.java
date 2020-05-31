package br.com.coradini.testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ConsultaCepValidoTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/91060900/json/";
    }

    @Test
    public void consultaCepValidoTest() {
        when().
                get().
        then().
                statusCode(200).
                body("cep", is("91060-900")).
                body(containsString("logradouro")).
                body(containsString("complemento")).
                body(containsString("bairro")).
                body(containsString("localidade")).
                body(containsString("uf")).
                body(containsString("ibge"));
    }

}
