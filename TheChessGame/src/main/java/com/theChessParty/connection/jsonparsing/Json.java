package com.theChessParty.connection.jsonparsing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class Json {

    private static ObjectMapper objectMapper = getDefaultObjectMapper();

    /**
     * Creates an ObjectMapper object with configurations
     * @return ObjectMapper that has personalized configurations
     */
    private static ObjectMapper getDefaultObjectMapper(){
        ObjectMapper defaultObjectMapper = new ObjectMapper();
        defaultObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return defaultObjectMapper;
    }

    /**
     * Takes in a JSON String and parses the data tree. The tree will represent the objects and value pairs
     * found in the JSON String.
     * @param src a JSON String object
     * @return a JsonNode
     * @throws IOException if the values in the String are invalid
     */
    public static JsonNode parse(String src) throws IOException {
        return objectMapper.readTree(src);
    }

    /**
     * Takes a JsonNode object and a specified class type and converts the values of the JSON object into a POJO
     *
     * @param node a JsonNode node that is storing the JSON type value pairs
     * @param classType the Class type that the JSON is to be converted to
     * @param <A> generic datatype that will match the classType
     * @return the newly created POJO
     * @throws JsonProcessingException if the values in the String are invalid
     */
    public static <A> A fromJson(JsonNode node, Class<A> classType) throws JsonProcessingException {
        return objectMapper.treeToValue(node, classType);
    }

    /**
     * Takes in a Java object and converts the data into a JsonNode
     * @param a a Java object that is to be converted
     * @return the newly created JsonNode object with the values of 'a' Object
     */
    public static JsonNode toJson(Object a){
        return objectMapper.valueToTree(a);
    }

//    public static String stringify(JsonNode node ){
//        ObjectWriter objectWritter = objectMapper.writer();
//
//        return objectWritter.writeValueAsString(node);
//    }
}
