package com.zm.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@FeignClient(value = "zhangmen-provider")
public interface ZmServiceFeign {

    @GetMapping("test")
    void test();
}
