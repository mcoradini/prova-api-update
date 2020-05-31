package br.com.coradini.testcases;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;

@DisplayName("CEP Inexistente")
public class ConsultaCepInexistenteTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/11111111/json";
    }

    @DisplayName("Consulta API por um CEP inexistente")
    @Description("Dado que o usuário inseri um CEP que não exista na base dos Correios\n" +
                "Quando o serviço é consultado \n" +
                "Então é retornada um atributo erro\n")
    @Test
    public void consultaCepInexistenteTest() {
        when().
                get().
        then().
                statusCode(200).
                body("erro", is(true));
    }

}
