package DTO;

import java.time.LocalDate;

public class CurrentWeatherDTO {

private String description;
private Double temperature;
private Double feelsLikeTemperature;
private Double windSpeed;
private String cityName;
private String countryName;
        private LocalDate date;

    public CurrentWeatherDTO(String description, Double temperature, Double feelsLikeTemperature, Double windSpeed, String cityName, String countryName, LocalDate date) {
        this.description = description;
        this.temperature = temperature;
        this.feelsLikeTemperature = feelsLikeTemperature;
        this.windSpeed = windSpeed;
        this.cityName = cityName;
        this.countryName = countryName;
        this.date = date;
    }



}
