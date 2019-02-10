package org.bootstaticsampler.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.http.HttpStatus;

public class BootSamplerWebAppErrorRegistrar implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error/404.html"));
        registry.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/error/400.html"));
    }
}
