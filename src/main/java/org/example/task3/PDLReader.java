package org.example.task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PDLReader {

    @SneakyThrows
    public Company fetch(String companyName) {
        String API_KEY = "";
        URL url = new URL("https://api.peopledatalabs.com/v5/company/enrich?website=" + companyName);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("X-Api-Key", API_KEY);
        connection.connect();
        String text = new Scanner(connection.getInputStream()).useDelimiter("\\Z").next();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(text, Company.class);
    }

}
