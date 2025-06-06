package com.example.gs_soa.service;

import com.example.gs_soa.data.Incident;
import com.example.gs_soa.data.IncidentRepository;
import com.example.gs_soa.service.external.WeatherService;
import com.example.gs_soa.service.external.WeatherService.WeatherResponse;
import com.example.gs_soa.soap.client.CityInfrastructureNotificationClient;
import com.example.gs_soa.soap.client.NotifyIncidentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private CityInfrastructureNotificationClient cityInfrastructureNotificationClient;

    public Incident createIncident(Incident incident) {
        return incidentRepository.save(incident);
    }

    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    public Optional<Incident> getIncidentById(Long id) {
        return incidentRepository.findById(id);
    }

    public WeatherResponse getWeatherForLocation(double latitude, double longitude) {
        return weatherService.getCurrentWeather(latitude, longitude);
    }

    public NotifyIncidentResponse notifyCityInfrastructure(long incidentId, String location, String description, String incidentType) {
        return cityInfrastructureNotificationClient.notifyIncident(incidentId, location, description, incidentType);
    }
}

