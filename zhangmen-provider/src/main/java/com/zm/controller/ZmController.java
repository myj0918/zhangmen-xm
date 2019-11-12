package com.zm.controller;

import com.zm.service.ZmService;
import com.zm.service.ZmServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ZmController implements ZmServiceFeign {
    @Resource
    private ZmService zmService;

    //测试框架
    @GetMapping("/test")
    @Override
    public void test() {
        System.out.println("框架可用");
    }
}
