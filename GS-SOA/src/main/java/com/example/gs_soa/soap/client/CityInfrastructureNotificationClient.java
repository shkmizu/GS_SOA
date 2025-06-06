package com.example.gs_soa.soap.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class CityInfrastructureNotificationClient extends WebServiceGatewaySupport {

    public NotifyIncidentResponse notifyIncident(long incidentId, String location, String description, String incidentType) {
        NotifyIncidentRequest request = new NotifyIncidentRequest();
        request.setIncidentId(incidentId);
        request.setLocation(location);
        request.setDescription(description);
        request.setIncidentType(incidentType);

        return (NotifyIncidentResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/citynotifications", request,
                        new SoapActionCallback("http://www.example.com/city/infrastructure/notifications/NotifyIncident"));
    }
}

