package com.EstudoProva.estudo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
    http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                            .requestMatchers(HttpMethod.POST,"/campeoes").permitAll()
                            .requestMatchers(HttpMethod.GET,"/campeoes").permitAll()
                            .requestMatchers(HttpMethod.GET,"/capeoes/**").permitAll()
                            .requestMatchers(HttpMethod.DELETE,"/campeoes/**").permitAll()
                            .requestMatchers(HttpMethod.PUT,"/campeoes").permitAll()
                            .anyRequest().authenticated()
                    )
            .sessionManagement(session->session.
                    sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            );
            return http.build();
    }
}
