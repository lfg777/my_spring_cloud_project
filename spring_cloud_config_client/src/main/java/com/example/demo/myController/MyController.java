package com.example.demo.myController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lifengguang on 2017/6/7.
 */
@RestController
public class MyController {

    @Value("${mytest}")
    String name;

    @RequestMapping("/")
    public String getName(){
        return "hello " + name;
    }
}
