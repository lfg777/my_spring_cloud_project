package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifengguang on 2017/6/5.
 */
@RestController
public class MyController {

    @Value("${myName}")
    private String name;

    @RequestMapping("/getName")
    public String getName(){
        return name;
    }
}
