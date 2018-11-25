package com.heuman.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author heuman
 * @date 2018/11/25 19:24
 */
@RestController
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return this.restTemplate.postForEntity("http://service-provider/sayHello", null, String.class).getBody();
    }

}
