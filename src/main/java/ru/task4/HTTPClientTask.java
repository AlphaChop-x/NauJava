package ru.task4;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPClientTask {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (HttpClient client = HttpClient.newHttpClient()) {

            //Отправляем GET реквест по адресу https://httpbin.org/ip
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://httpbin.org/ip"))
                    .GET()
                    .build();

            //Получаем ответ
            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());

            //Создаём маппер из библиотеки Jakson и читаем тело ответа
            ObjectMapper mapper = new ObjectMapper();
            IpResponse ipResponse = mapper.readValue(response.body(), IpResponse.class);

            System.out.println(ipResponse.getOrigin());
        }
    }
}
