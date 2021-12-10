package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description： TODO
 * @Author: meiyt
 * @Date: Created in 2021/12/7
 */
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @GetMapping
    public String getUser(){
        log.info("========测试Logstash日志采集测试========");
        return "admin";
    }
}
