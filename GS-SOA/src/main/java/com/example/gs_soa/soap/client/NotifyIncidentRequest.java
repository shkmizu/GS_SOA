package com.example.gs_soa.soap.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "incidentId",
    "location",
    "description",
    "incidentType"
})
@XmlRootElement(name = "NotifyIncidentRequest")
public class NotifyIncidentRequest {

    protected long incidentId;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String incidentType;

    public long getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(long value) {
        this.incidentId = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public void setIncidentType(String value) {
        this.incidentType = value;
    }

}

