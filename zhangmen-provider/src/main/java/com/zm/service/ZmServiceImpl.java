package com.zm.service;

import com.zm.mapper.ZmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZmServiceImpl implements  ZmService{
    @Autowired
    private ZmMapper zmMapper;
}
