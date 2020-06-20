package com.atguigu.gmall.gatemay.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;

import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 跨域请求 配置
 */
@Configuration
public class GmallCorsConfig {

    @Bean
    public CorsWebFilter corsWebFilter(){
        //cors 跨域配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://localhost:1000/");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");


        //配置源对象
        UrlBasedCorsConfigurationSource corsConfigurationSource = new UrlBasedCorsConfigurationSource();
        corsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(corsConfigurationSource);
    }
}
