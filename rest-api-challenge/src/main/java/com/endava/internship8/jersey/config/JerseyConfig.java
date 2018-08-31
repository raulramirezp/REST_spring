package com.endava.internship8.jersey.config;

import com.endava.internship8.jersey.services.MovieDBService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(MovieDBService.class);
    }
}
