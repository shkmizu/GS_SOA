package com.example.gs_soa.service.external;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String WEATHER_API_URL = "https://api.open-meteo.com/v1/forecast?latitude={latitude}&longitude={longitude}&current_weather=true";

    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getCurrentWeather(double latitude, double longitude) {
        return restTemplate.getForObject(WEATHER_API_URL, WeatherResponse.class, latitude, longitude);
    }

    public static class WeatherResponse {
        @JsonProperty("current_weather")
        private CurrentWeather currentWeather;

        public CurrentWeather getCurrentWeather() {
            return currentWeather;
        }

        public void setCurrentWeather(CurrentWeather currentWeather) {
            this.currentWeather = currentWeather;
        }
    }

    public static class CurrentWeather {
        private double temperature;
        private double windspeed;
        private double winddirection;
        private int weathercode;
        private String time;

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public double getWindspeed() {
            return windspeed;
        }

        public void setWindspeed(double windspeed) {
            this.windspeed = windspeed;
        }

        public double getWinddirection() {
            return winddirection;
        }

        public void setWinddirection(double winddirection) {
            this.winddirection = winddirection;
        }

        public int getWeathercode() {
            return weathercode;
        }

        public void setWeathercode(int weathercode) {
            this.weathercode = weathercode;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}

