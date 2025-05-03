package com.codejam.codex.authzen.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "github")
public class GithubConfig {
    private String clientId;
    private String clientSecret;
    private String redirectUri;
}
