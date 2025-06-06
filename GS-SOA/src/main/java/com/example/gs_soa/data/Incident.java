package com.example.gs_soa.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Location is mandatory")
    private String location;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @NotNull(message = "Date and time are mandatory")
    private LocalDateTime dateTime;

    // Constructors
    public Incident() {
    }

    public Incident(String location, String description, LocalDateTime dateTime) {
        this.location = location;
        this.description = description;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Incident{" +
               "id=" + id +
               ", location='" + location + '\'' +
               ", description='" + description + '\'' +
               ", dateTime=" + dateTime +
               '}';
    }
}

