package com.example.gs_soa.soap.client;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://www.example.com/city/infrastructure/notifications", name = "CityInfrastructureNotificationPort")
@XmlSeeAlso({
    ObjectFactory.class
})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CityInfrastructureNotificationPort {

    @WebMethod(operationName = "NotifyIncident", action = "http://www.example.com/city/infrastructure/notifications/NotifyIncident")
    @WebResult(name = "NotifyIncidentResponse", targetNamespace = "http://www.example.com/city/infrastructure/notifications", partName = "parameters")
    public NotifyIncidentResponse notifyIncident(
        @WebParam(name = "NotifyIncidentRequest", targetNamespace = "http://www.example.com/city/infrastructure/notifications", partName = "parameters")
        NotifyIncidentRequest parameters);

}

