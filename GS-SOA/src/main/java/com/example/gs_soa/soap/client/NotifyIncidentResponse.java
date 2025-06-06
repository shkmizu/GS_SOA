package com.example.gs_soa.soap.client;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "confirmationId",
    "status"
})
@XmlRootElement(name = "NotifyIncidentResponse")
public class NotifyIncidentResponse {

    @XmlElement(required = true)
    protected String confirmationId;
    @XmlElement(required = true)
    protected String status;

    public String getConfirmationId() {
        return confirmationId;
    }

    public void setConfirmationId(String value) {
        this.confirmationId = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        this.status = value;
    }

}

