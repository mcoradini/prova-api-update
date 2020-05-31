package br.com.coradini.testcases;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsultaCepMultiploTestCase {

    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @BeforeEach
    public void setUp() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://viacep.com.br").
                setBasePath("/ws/RS/Gravatai/Barroso/json/").
                build();

        responseSpec = new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                build();
    }

    @Test
    public void consultaCepMultiploTest() {
        Response response =
                given().
                        spec(requestSpec).
                when().
                        get().
                then().
                        spec(responseSpec).
                and().
                        statusCode(200).
                        extract().
                        response();

        List<String> cep = response.body().jsonPath().get("cep");

        assertTrue(cep.size() > 1);
    }

}
