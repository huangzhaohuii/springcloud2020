package com.huang.springcloud_nacos_consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author HUANG
 * @date 2020/4/21 19:34
 */
@Configuration
public class RestTemplatConf {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
