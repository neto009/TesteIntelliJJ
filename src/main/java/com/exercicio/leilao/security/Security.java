package com.exercicio.leilao.security;

import java.beans.Customizer;

import javax.annotation.security.PermitAll;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.authorizeHttpRequests().antMatchers("/h2-console/**").permitAll().anyRequest().authenticated()
        .and()
        .csrf((csrf)-> csrf.ignoringAntMatchers("/h2-console/**"))
        .headers().frameOptions().disable()
        .and()
        .httpBasic();
        return http.build();
    }
}
