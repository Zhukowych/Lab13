package org.example.task3;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebScrapper {

    private String url;

    public WebScrapper(String url) {
        this.url = url;
    }

    @SneakyThrows
    public String fetchData(String companyName) {
        HttpClient httpClient = HttpClient.newBuilder().build();


        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI(url + companyName))
                .header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36")
                .header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8")
                .header("Accept-Language", "en-US,en;q=0.9")
                .header("Connection", "keep-alive")
                .build();

        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        Document doc = Jsoup.parse(response.body());

        return doc.text();
    }

}
