package com.huang.springcloud_nacos_consumer.controller;

import com.huang.springclouscommonapi.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author HUANG
 * @date 2020/4/21 18:55
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class testController {

    @Resource
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8001/provider/p1/";

    @RequestMapping("/c1/{id}")
    public R consumer(@PathVariable("id")String id){
        System.out.println(URL+id);
        return restTemplate.getForObject(URL+id, R.class);
    }
}
