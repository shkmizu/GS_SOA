package com.example.gs_soa.config;

import com.example.gs_soa.soap.client.CityInfrastructureNotificationClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.gs_soa.soap.client");
        return marshaller;
    }

    @Bean
    public CityInfrastructureNotificationClient cityInfrastructureNotificationClient(Jaxb2Marshaller marshaller) {
        CityInfrastructureNotificationClient client = new CityInfrastructureNotificationClient();
        client.setDefaultUri("http://localhost:8080/ws/citynotifications");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}

