package com.boot.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author ： liyang
 * &#064;@date    ： 2025/6/12 17:11
 * &#064;@description：
 */
public class JacksonUtils {

    private static final ObjectMapper objectMapper = new ObjectMapper();
    public static String toJson(Object obj) throws JsonProcessingException {
        return objectMapper.writeValueAsString(obj);
    }

    public static  <T> T parse(String json, Class<T> clazz) throws JsonProcessingException {
        return objectMapper.readValue(json, clazz);
    }
}
