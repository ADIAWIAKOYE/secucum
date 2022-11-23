package com.example.secucom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import java.util.Collections;

@Configuration
@EnableWebSecurity
public class ConfigSecurity {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        return http.authorizeHttpRequests()
                .antMatchers("/private").authenticated()
                .anyRequest().permitAll()
                   .and()
                .formLogin()
                   .and()
                .build();
        // @formatter:on
    }

    @Bean
    public UserDetailsService userDetailsService(){
        return new InMemoryUserDetailsManager(
                new User("user", "{noop}password", Collections.emptyList())
        );
    }
}
