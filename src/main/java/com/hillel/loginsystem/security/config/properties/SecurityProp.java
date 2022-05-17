package com.hillel.loginsystem.security.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "application.security")
@Data
public class SecurityProp {

    private long tokenValidSecond;
    private String signingKey;

}
