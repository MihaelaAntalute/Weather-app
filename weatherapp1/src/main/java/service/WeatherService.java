package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

@Service
public class WeatherService {
    private static final String CURRENT_WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}&units=metric";

    @Value("${api.openweathermap.key}")
    private String apiKey;

    private RestTemplate restTemplate;

    @Autowired
    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getCurrentWeather(String cityName) throws JsonProcessingException {
        URI url = new UriTemplate(CURRENT_WEATHER_URL).expand(cityName, apiKey);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String weatherBody = response.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(response.getBody());
        String description = root.path("weather").get(0).path("description").toString();
        Integer windSpeed = root.path("wind").path("speed").asInt();
        Integer temperature = root.path("main").path("temperature").asInt();
        return "";

    }
}
