package org.example.task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BrandFetchReader {

    public static final String BRAND_FETCH_URL = "https://api.brandfetch.io/v2/brands/";
    public static final String API_KEY = "mo+qSavAltOdsn6WqnL1mWh9vCTUotElDYtPmtBRy+E=";

    @SneakyThrows
    public Company fetchCompany(String companyName) {
        HttpClient httpClient = HttpClient.newBuilder().build();


        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI(BRAND_FETCH_URL + companyName))
                .header("Authorization", "Bearer " + API_KEY)
                .build();


        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(response.body(), Company.class);
    }

}
