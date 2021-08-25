package com.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author yuesj
 * @date 2021-08-25
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 表单登录
        http.formLogin()
                .and()
                // 认证配置
                .authorizeRequests()
                // 任何请求
                .anyRequest()
                // 都需要身份验证
                .authenticated();
    }
}
