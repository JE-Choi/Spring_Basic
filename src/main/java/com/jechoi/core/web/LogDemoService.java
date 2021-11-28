package com.jechoi.core.web;

import com.jechoi.core.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.inject.Provider;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    private final Provider<MyLogger> myLoggerProvider;

    public void logic(String id) {
        MyLogger myLogger = myLoggerProvider.get();
        myLogger.log("service id=" + id);
    }
}