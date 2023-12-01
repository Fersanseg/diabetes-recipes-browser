package com.example;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class ApiParamsEncoder {
    public static String prep(String queryString) {
        String output = "";
        try {
            output = URLEncoder.encode(output, StandardCharsets.UTF_8.toString());
            output = URLDecoder.decode(output, StandardCharsets.UTF_8.toString());
        } catch(UnsupportedEncodingException ex) {
            ex.getStackTrace();
        }

        return output;
    }
}
