package com.example.diabetesapi.routes;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ApiParamsEncoder;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class GetRecipes {
    @GetMapping("/search")

    public String search(HttpServletRequest request) {
        String qs = ApiParamsEncoder.prep(request.getQueryString());

        // TODO: append API ID and API KEY

        return qs;
    }
}
