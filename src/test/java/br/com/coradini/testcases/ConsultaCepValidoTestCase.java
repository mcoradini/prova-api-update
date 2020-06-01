package br.com.coradini.testcases;

import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@DisplayName("CEP Válido")
public class ConsultaCepValidoTestCase {

    @BeforeEach
    public void setUp() {
        baseURI = "https://viacep.com.br";
        basePath = "/ws/91060900/json/";
    }

    @DisplayName("Consulta API por um CEP válido")
    @Description("Dado que o usuário inseri um CEP válido\n" +
                "Quando o serviço é consultado\n" +
                "Então é retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge.\n")
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
