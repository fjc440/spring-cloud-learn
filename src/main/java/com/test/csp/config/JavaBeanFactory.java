package com.test.csp.config;


import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import com.test.csp.web.WebInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaBeanFactory {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }

    @Bean
    public WebInterceptor securityInterceptor(){
        return new WebInterceptor();
    }


}
