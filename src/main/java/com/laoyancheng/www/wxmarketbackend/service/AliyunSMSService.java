package com.laoyancheng.www.wxmarketbackend.service;

import org.springframework.stereotype.Service;


public interface AliyunSMSService {
    void sendCode(String phone);
}
