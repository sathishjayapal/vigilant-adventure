package org.bootstaticsampler.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class BootSamplerWebAppWebConfigurer implements WebMvcConfigurer{
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/", "/error/","/images");
    }
//        registry.addResourceHandler("/pages/","/error/")
//                .addResourceLocations("classpath:/static/", "classpath:/pages/",
//                        "classpath:/error/", "classpath:/static/images/")
//                .setCacheControl(CacheControl.maxAge(2, TimeUnit.HOURS)
//                        .cachePublic()).resourceChain(true);
//    }
//
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/")
                .setViewName("/main/index.html");
    }

}
