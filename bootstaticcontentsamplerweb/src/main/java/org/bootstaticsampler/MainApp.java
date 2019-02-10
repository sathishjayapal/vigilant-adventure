package org.bootstaticsampler;

import org.bootstaticsampler.config.BootSamplerFavIconConfiguration;
import org.bootstaticsampler.config.BootSamplerWebAppErrorRegistrar;
import org.bootstaticsampler.config.BootSamplerWebAppWebConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        JdbcTemplateAutoConfiguration.class})
public class MainApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        final SpringApplication springApplication =
                new SpringApplication(BootSamplerWebAppErrorRegistrar.class,
                        BootSamplerWebAppWebConfigurer.class, BootSamplerFavIconConfiguration.class,
                        MainApp.class);
        springApplication.run(args);
    }
}