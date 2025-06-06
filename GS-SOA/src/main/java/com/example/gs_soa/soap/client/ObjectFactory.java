package com.example.gs_soa.soap.client;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public NotifyIncidentRequest createNotifyIncidentRequest() {
        return new NotifyIncidentRequest();
    }

    public NotifyIncidentResponse createNotifyIncidentResponse() {
        return new NotifyIncidentResponse();
    }

}

