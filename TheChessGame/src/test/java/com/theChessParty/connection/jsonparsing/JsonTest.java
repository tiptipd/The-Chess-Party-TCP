package com.theChessParty.connection.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.theChessParty.connection.jsonparsing.Json;
import com.theChessParty.connection.pojo.SimpleTestCaseJsonPOJO;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonTest {
    String simpleTestCaseJsonSource = "{ \"title\": \"Coder From Scratch\", \"author\": \"John\" }";

    @Test
    void parse() throws IOException {
        JsonNode node = Json.parse(simpleTestCaseJsonSource);
        assertEquals(node.get("title").asText(), "Coder From Scratch");
    }

    @Test
    void fromJson() throws IOException {
        JsonNode node = Json.parse(simpleTestCaseJsonSource);
        SimpleTestCaseJsonPOJO pojo = Json.fromJson(node, SimpleTestCaseJsonPOJO.class);

        assertEquals(pojo.getTitle(), "Coder From Scratch");
    }

    @Test
    void toJson(){
        SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
        pojo.setTitle("test 123");

        JsonNode node = Json.toJson(pojo);

        assertEquals(node.get("title").asText(), "test 123");
    }
//
//    @Test
//    void stringify() throws JsonProcessingException {
//        SimpleTestCaseJsonPOJO pojo = new SimpleTestCaseJsonPOJO();
//        pojo.setTitle("test 123");
//
//        JsonNode node = Json.toJson(pojo);
//        System.out.println(Json.stringify(node));
//    }
}