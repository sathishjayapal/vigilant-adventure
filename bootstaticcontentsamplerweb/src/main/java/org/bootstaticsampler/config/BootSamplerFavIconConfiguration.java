package org.bootstaticsampler.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class BootSamplerFavIconConfiguration {
    @Bean
    public SimpleUrlHandlerMapping customFavIconHandlerMapping() {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        simpleUrlHandlerMapping.setOrder(Integer.MIN_VALUE);
        simpleUrlHandlerMapping.setUrlMap(Collections.singletonMap("/favicon.ico", faviconRequestHandler()));
        return simpleUrlHandlerMapping;
    }

    @Bean
    public ResourceHttpRequestHandler faviconRequestHandler() {
        ResourceHttpRequestHandler resourceHttpRequestHandler = new ResourceHttpRequestHandler();
        ClassPathResource classPathResource = new ClassPathResource("/static/images/favicon.ico");
        List<Resource> locations = Arrays.asList(classPathResource);
        resourceHttpRequestHandler.setLocations(locations);
        return resourceHttpRequestHandler;
    }
}
