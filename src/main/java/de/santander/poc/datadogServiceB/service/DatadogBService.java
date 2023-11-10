package de.santander.poc.datadogServiceB.service;

import org.springframework.stereotype.Service;

@Service
public class DatadogBService {

    private final String WORLD = "World";

    public String getDatadogBMessage() {
        return WORLD;
    }
}
