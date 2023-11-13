package de.santander.poc.datadogServiceB.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DatadogBService {

    private final String WORLD = "World";

    private static final Logger logger = LogManager.getLogger(DatadogBService.class);

    public String getDatadogBMessage() {
        logger.info("Returning info from DatadogBService");
        return WORLD;
    }
}
