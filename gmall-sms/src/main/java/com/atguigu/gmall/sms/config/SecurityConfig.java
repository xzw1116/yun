package com.atguigu.gmall.sms.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *Web系统安全权限框架
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * 所有页面放行
         */
        http.authorizeRequests().antMatchers("/**").permitAll();
        http.csrf().disable();


    }

}
