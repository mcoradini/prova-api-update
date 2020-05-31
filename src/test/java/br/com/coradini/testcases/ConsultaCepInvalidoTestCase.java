package br.com.coradini.testcases;

import io.qameta.allure.Description;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

@DisplayName("CEP Inválido")
public class ConsultaCepInvalidoTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/9106090/json";
    }

    @DisplayName("Consulta API por um CEP Inválido")
    @Description("Dado que o usuário inseri um CEP com formato inválido\n" +
                "Quando o serviço é consultado \n" +
                "Então é retornado uma mensagem de erro\n")
    @Test
    public void consultaCepInvalidoTest() {
        when().
                get().
        then().
                statusCode(400).
                body("html.body.h3", equalTo("Verifique a sua URL (Bad Request)"));
    }

}
