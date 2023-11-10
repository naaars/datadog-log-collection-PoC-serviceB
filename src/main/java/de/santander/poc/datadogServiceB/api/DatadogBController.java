package de.santander.poc.datadogServiceB.api;

import de.santander.poc.datadogServiceB.service.DatadogBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/world")
public class DatadogBController {

    @Autowired
    private DatadogBService datadogBService;

    @GetMapping
    public ResponseEntity<String> getHelloWorldMessage() {
        return ResponseEntity.status(HttpStatus.OK).body(datadogBService.getDatadogBMessage());
    }
}
