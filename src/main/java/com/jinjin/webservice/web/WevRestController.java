package com.jinjin.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WevRestController {
    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

}
