package com.zm.controller;

import com.zm.service.ZmServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ZmController {

    @Resource
    private ZmServiceFeign zmServiceFeign;

    //测试框架
    @RequestMapping("/test")
    public  void test(){
        zmServiceFeign.test();
    }

}


