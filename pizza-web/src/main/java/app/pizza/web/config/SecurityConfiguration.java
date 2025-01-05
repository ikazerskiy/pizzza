package app.pizza.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {

  @Bean
  public SecurityFilterChain web(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity.authorizeHttpRequests(
            authorizationRegistry -> authorizationRegistry.anyRequest().permitAll())
        .build();
  }
}
