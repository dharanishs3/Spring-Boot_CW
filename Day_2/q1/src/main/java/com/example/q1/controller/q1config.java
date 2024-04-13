package com.example.q1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class q1config {
    @Value("${appname}")
    private String appName;
    @Value("${appversion}")
    private String appVersion;
    public String getAppName() {
        return appName;
    }
    public String getAppVersion() {
        return appVersion;
    }
}
