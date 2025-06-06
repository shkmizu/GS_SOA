package com.example.gs_soa.controller;

import com.example.gs_soa.data.Incident;
import com.example.gs_soa.service.IncidentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
@Tag(name = "Incident Management", description = "APIs for managing incidents")
public class IncidentController {

    @Autowired
    private IncidentService incidentService;

    @Operation(summary = "Create a new incident report", description = "Creates a new incident report in the system.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Incident created successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @PostMapping
    public ResponseEntity<Incident> createIncident(@Valid @RequestBody Incident incident) {
        Incident createdIncident = incidentService.createIncident(incident);
        return new ResponseEntity<>(createdIncident, HttpStatus.CREATED);
    }

    @Operation(summary = "Get all incident reports", description = "Retrieves a list of all incident reports.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved list")
    })
    @GetMapping
    public ResponseEntity<List<Incident>> getAllIncidents() {
        List<Incident> incidents = incidentService.getAllIncidents();
        return new ResponseEntity<>(incidents, HttpStatus.OK);
    }
}

