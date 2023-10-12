package com.akinserhat.discoveryserver.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfigAdapter {
    void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception;

    void configure(HttpSecurity http) throws Exception;
}
