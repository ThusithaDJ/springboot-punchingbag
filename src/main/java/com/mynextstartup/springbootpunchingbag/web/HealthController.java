package com.mynextstartup.springbootpunchingbag.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HealthController.class);

    @GetMapping
    public String health() {
        LOGGER.info("RECEIVED HEALTH REQUEST");
        return "UP";
    }
}
